package com.dcinside.app.write;

import Y.b0;
import Y.c4;
import Y.g4;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.FileUtils;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.SparseArray;
import android.view.GestureDetector.OnGestureListener;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.album.AlbumActivity;
import com.dcinside.app.dccon.j;
import com.dcinside.app.http.p;
import com.dcinside.app.image.edit.ImageEditActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.model.AiImageStatusResult;
import com.dcinside.app.model.AiPromptLoadItem;
import com.dcinside.app.model.P;
import com.dcinside.app.model.PostModify;
import com.dcinside.app.model.VideoUploadResult;
import com.dcinside.app.model.f;
import com.dcinside.app.model.s;
import com.dcinside.app.post.fragments.H4;
import com.dcinside.app.post.fragments.g;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.j0;
import com.dcinside.app.realm.k0;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.response.PostHeadPlaceHolder;
import com.dcinside.app.rx.bus.G;
import com.dcinside.app.rx.bus.q;
import com.dcinside.app.settings.WriteSettingActivity;
import com.dcinside.app.settings.image.AutoImageData;
import com.dcinside.app.settings.image.model.AutoImage;
import com.dcinside.app.settings.image.setting.DefaultImageSettingActivity;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Fk;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.Wk;
import com.dcinside.app.util.Yk;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.util.wk;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.PickedBottomIndicatorView;
import com.dcinside.app.view.dccon.DcConPickerView;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.dcinside.app.view.tool.e;
import com.dcinside.app.write.menu.MenuVisible;
import com.dcinside.app.write.menu.ai.AiImageMakeActivity;
import com.dcinside.app.write.menu.ai.S;
import com.dcinside.app.write.menu.ai.character.CharaPromptSearchActivity;
import com.dcinside.app.write.menu.ai.type.AiModelItem;
import com.dcinside.app.write.menu.ai.v0;
import com.dcinside.app.write.menu.ai.w0;
import com.dcinside.app.write.menu.series.SeriesListActivity;
import com.dcinside.app.write.menu.series.SeriesManageActivity;
import com.dcinside.app.write.menu.setting.PostAutoDeleteActivity;
import com.dcinside.app.write.menu.setting.PostPollSettingActivity;
import com.dcinside.app.write.menu.setting.SecretPostSettingActivity;
import com.dcinside.app.write.menu.setting.WriteMenuOrderActivity;
import com.dcinside.app.write.menu.setting.WriteMiniSettingActivity;
import com.dcinside.app.write.menu.video.VideoInfoData;
import com.dcinside.app.write.menu.video.VideoSettingActivity;
import com.dcinside.app.write.results.PostTempActivityResult.a;
import com.dcinside.app.write.results.PostTempActivityResult;
import com.dcinside.app.youtube.YoutubeSearchActivity;
import com.dcinside.rich.RichEditText;
import com.dcinside.rich.RichToolbar;
import com.dcinside.rich.color.ColorPickerView;
import com.google.android.material.appbar.AppBarLayout.Behavior;
import com.google.android.material.appbar.AppBarLayout.LayoutParams;
import com.google.android.material.appbar.AppBarLayout;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import fr.castorflex.android.smoothprogressbar.SmoothProgressBar;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.g1;
import io.realm.r1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import org.jsoup.nodes.y;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nPostWriteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 8 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 9 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n*L\n1#1,4099:1\n1#2:4100\n177#3,9:4101\n177#3,9:4204\n177#3,9:4213\n177#3,6:4230\n192#3,7:4236\n183#3,3:4243\n192#3,7:4256\n177#3,9:4304\n192#3,7:4350\n295#4,2:4110\n1557#4:4122\n1628#4,3:4123\n1557#4:4126\n1628#4,3:4127\n295#4,2:4130\n295#4,2:4132\n295#4,2:4134\n1755#4,3:4155\n774#4:4201\n865#4,2:4202\n2632#4,3:4227\n1557#4:4246\n1628#4,3:4247\n295#4,2:4266\n295#4,2:4375\n60#5:4112\n60#5:4113\n60#5:4114\n60#5:4115\n257#6,2:4116\n257#6,2:4118\n257#6,2:4120\n257#6,2:4136\n257#6,2:4138\n257#6,2:4140\n257#6,2:4142\n257#6,2:4144\n257#6,2:4146\n257#6,2:4148\n257#6,2:4150\n257#6,2:4152\n257#6,2:4158\n257#6,2:4160\n257#6,2:4162\n257#6,2:4164\n257#6,2:4166\n257#6,2:4168\n257#6,2:4170\n257#6,2:4172\n257#6,2:4174\n257#6,2:4176\n257#6,2:4178\n257#6,2:4180\n257#6,2:4182\n257#6,2:4184\n257#6,2:4186\n255#6:4188\n257#6,2:4189\n257#6,2:4191\n257#6,2:4193\n257#6,2:4195\n257#6,2:4197\n257#6,2:4199\n257#6,2:4222\n255#6:4224\n255#6:4252\n255#6:4255\n257#6,2:4264\n257#6,2:4268\n257#6,2:4270\n257#6,2:4272\n257#6,2:4274\n257#6,2:4276\n257#6,2:4278\n257#6,2:4280\n257#6,2:4282\n257#6,2:4284\n257#6,2:4286\n257#6,2:4288\n257#6,2:4290\n257#6,2:4292\n257#6,2:4294\n257#6,2:4296\n257#6,2:4298\n257#6,2:4300\n257#6,2:4302\n255#6:4313\n255#6:4314\n257#6,2:4315\n327#6,4:4317\n255#6:4321\n327#6,4:4322\n257#6,2:4326\n257#6,2:4328\n257#6,2:4330\n257#6,2:4332\n327#6,4:4334\n257#6,2:4338\n257#6,2:4340\n257#6,2:4342\n257#6,2:4344\n257#6,2:4346\n257#6,2:4348\n255#6:4357\n327#6,4:4358\n257#6,2:4362\n327#6,4:4364\n257#6,2:4368\n255#6:4370\n257#6,2:4371\n257#6,2:4373\n25#7:4154\n37#8,2:4225\n37#8,2:4250\n37#8,2:4253\n9#9:4263\n*S KotlinDebug\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity\n*L\n686#1:4101,9\n2718#1:4204,9\n2777#1:4213,9\n3135#1:4230,6\n3136#1:4236,7\n3135#1:4243,3\n3282#1:4256,7\n3597#1:4304,9\n3801#1:4350,7\n754#1:4110,2\n1044#1:4122\n1044#1:4123,3\n1189#1:4126\n1189#1:4127,3\n1189#1:4130,2\n1204#1:4132,2\n1229#1:4134,2\n1955#1:4155,3\n2670#1:4201\n2670#1:4202,2\n3127#1:4227,3\n3157#1:4246\n3157#1:4247,3\n3364#1:4266,2\n3110#1:4375,2\n809#1:4112\n812#1:4113\n815#1:4114\n818#1:4115\n961#1:4116,2\n979#1:4118,2\n991#1:4120,2\n1378#1:4136,2\n1389#1:4138,2\n1391#1:4140,2\n1392#1:4142,2\n1395#1:4144,2\n1452#1:4146,2\n1453#1:4148,2\n1822#1:4150,2\n1877#1:4152,2\n2073#1:4158,2\n2074#1:4160,2\n2081#1:4162,2\n2082#1:4164,2\n2083#1:4166,2\n2084#1:4168,2\n2087#1:4170,2\n2088#1:4172,2\n2098#1:4174,2\n2099#1:4176,2\n2107#1:4178,2\n2108#1:4180,2\n2109#1:4182,2\n2110#1:4184,2\n2117#1:4186,2\n2147#1:4188\n2152#1:4189,2\n2154#1:4191,2\n2155#1:4193,2\n2158#1:4195,2\n2159#1:4197,2\n2160#1:4199,2\n2797#1:4222,2\n2997#1:4224\n3174#1:4252\n3214#1:4255\n3361#1:4264,2\n3534#1:4268,2\n3535#1:4270,2\n3536#1:4272,2\n3537#1:4274,2\n3546#1:4276,2\n3547#1:4278,2\n3548#1:4280,2\n3549#1:4282,2\n3554#1:4284,2\n3555#1:4286,2\n3557#1:4288,2\n3558#1:4290,2\n3562#1:4292,2\n3563#1:4294,2\n3575#1:4296,2\n3576#1:4298,2\n3577#1:4300,2\n3578#1:4302,2\n3629#1:4313\n3636#1:4314\n3661#1:4315,2\n3662#1:4317,4\n3733#1:4321\n3740#1:4322,4\n3746#1:4326,2\n3749#1:4328,2\n3750#1:4330,2\n3752#1:4332,2\n3759#1:4334,4\n3768#1:4338,2\n3772#1:4340,2\n3773#1:4342,2\n3780#1:4344,2\n3783#1:4346,2\n3784#1:4348,2\n3911#1:4357\n3978#1:4358,4\n3995#1:4362,2\n3996#1:4364,4\n4010#1:4368,2\n4018#1:4370\n4022#1:4371,2\n2792#1:4373,2\n1898#1:4154\n3036#1:4225,2\n3160#1:4250,2\n3202#1:4253,2\n3361#1:4263\n*E\n"})
public final class PostWriteActivity extends B1 implements GestureDetector.OnGestureListener, Wk, b, c, w0, a, PermissionListener {
    public static final class com.dcinside.app.write.PostWriteActivity.a {
        private com.dcinside.app.write.PostWriteActivity.a() {
        }

        public com.dcinside.app.write.PostWriteActivity.a(w w0) {
        }
    }

    @s0({"SMAP\nPostWriteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$OnPostTempChanges\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,4099:1\n147#2:4100\n*S KotlinDebug\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$OnPostTempChanges\n*L\n4087#1:4100\n*E\n"})
    static final class com.dcinside.app.write.PostWriteActivity.b implements P0 {
        @l
        private final t a;

        public com.dcinside.app.write.PostWriteActivity.b(@l PostWriteActivity postWriteActivity0) {
            L.p(postWriteActivity0, "activity");
            super();
            this.a = new t(postWriteActivity0);
        }

        @Override  // io.realm.P0
        public void M(Object object0) {
            this.a(((g1)object0));
        }

        public void a(@l g1 g10) {
            L.p(g10, "t");
            PostWriteActivity postWriteActivity0 = (PostWriteActivity)this.a.a();
            if(postWriteActivity0 != null) {
                postWriteActivity0.J8(g10);
            }
        }
    }

    @s0({"SMAP\nPostWriteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$ProgressHandler\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,4099:1\n147#2:4100\n*S KotlinDebug\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$ProgressHandler\n*L\n3433#1:4100\n*E\n"})
    static final class com.dcinside.app.write.PostWriteActivity.c extends Handler {
        @l
        private final t a;

        public com.dcinside.app.write.PostWriteActivity.c(@l PostWriteActivity postWriteActivity0) {
            L.p(postWriteActivity0, "activity");
            super(Looper.getMainLooper());
            this.a = new t(postWriteActivity0);
        }

        @Override  // android.os.Handler
        public void handleMessage(@l Message message0) {
            L.p(message0, "msg");
            PostWriteActivity postWriteActivity0 = (PostWriteActivity)this.a.a();
            if(postWriteActivity0 == null) {
                return;
            }
            int v = message0.arg1;
            b0 b00 = postWriteActivity0.x;
            b0 b01 = null;
            if(b00 == null) {
                L.S("binding");
                b00 = null;
            }
            ProgressBar progressBar0 = b00.t0;
            L.o(progressBar0, "postWriteProgressCircular");
            b0 b02 = postWriteActivity0.x;
            if(b02 == null) {
                L.S("binding");
            }
            else {
                b01 = b02;
            }
            SmoothProgressBar smoothProgressBar0 = b01.u0;
            L.o(smoothProgressBar0, "postWriteProgressHorizontal");
            if(v >= 1 && smoothProgressBar0.getMax() > v) {
                if(smoothProgressBar0.getVisibility() != 0) {
                    progressBar0.setVisibility(8);
                    smoothProgressBar0.setVisibility(0);
                }
                smoothProgressBar0.setProgress(v);
                return;
            }
            if(progressBar0.getVisibility() != 0) {
                progressBar0.setVisibility(0);
                smoothProgressBar0.setVisibility(8);
            }
        }
    }

    public final class d {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.dcinside.app.write.menu.b.values().length];
            try {
                arr_v[com.dcinside.app.write.menu.b.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.k.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.l.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.h.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.m.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.p.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.o.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.q.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.r.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.s.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.n.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.write.menu.b.j.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            d.a = arr_v;
        }
    }

    @m
    private PostModify A;
    @m
    private ActivityResultLauncher A9;
    private int B;
    @m
    private String B9;
    private int C;
    private int C9;
    private int D;
    private boolean D9;
    private int E;
    @m
    private o E9;
    @l
    private final D F;
    @m
    private ActivityResultLauncher F9;
    @l
    private final D G;
    @m
    private ActivityResultLauncher G9;
    @l
    private final D H;
    @m
    private o H9;
    @l
    private final D I;
    @m
    private AiImageStatusResult I9;
    private long J;
    @m
    private AiModelItem J9;
    @m
    private ValueAnimator K;
    private float K9;
    @l
    private final d1 L;
    private int L9;
    @l
    private final com.dcinside.app.dccon.c M;
    @m
    private o M8;
    private V1 M9;
    @m
    private g1 N;
    @m
    private o N8;
    @l
    private final D N9;
    @l
    private final com.dcinside.app.write.PostWriteActivity.b O;
    @m
    private o O8;
    @l
    private final D O9;
    @l
    private final h1 P;
    @m
    private o P8;
    @m
    private g1 P9;
    @m
    private e Q;
    @m
    private o Q8;
    @l
    private P0 Q9;
    @m
    private g R8;
    @m
    private S R9;
    @l
    private final rx.subscriptions.b S8;
    @m
    private GestureDetectorCompat S9;
    @l
    private final ArrayList T8;
    @m
    private ActivityResultLauncher T9;
    @m
    private B U8;
    private c4 U9;
    @m
    private g1 V8;
    private g4 V9;
    @l
    private final P0 W8;
    @l
    public static final com.dcinside.app.write.PostWriteActivity.a W9 = null;
    @l
    private com.dcinside.app.write.PostWriteActivity.c X;
    private boolean X8;
    public static final int X9 = 5;
    @m
    private p Y;
    @m
    private o Y8;
    @m
    private o Z;
    private boolean Z8;
    @m
    private o a9;
    @m
    private o b9;
    @m
    private o c9;
    private final rx.g d9;
    private boolean e9;
    @m
    private o f9;
    private boolean g9;
    @l
    private TextWatcher h9;
    @l
    private TextWatcher i9;
    @l
    private com.dcinside.rich.c j9;
    private int k9;
    private long l9;
    private boolean m9;
    @m
    private String n9;
    @m
    private String o9;
    private boolean p9;
    private boolean q9;
    @m
    private rx.subscriptions.b r9;
    @m
    private H4 s9;
    @m
    private com.dcinside.app.write.menu.a t9;
    @m
    private o u9;
    @m
    private o v9;
    @m
    private o w9;
    private b0 x;
    @l
    private final PostTempActivityResult x9;
    @m
    private ItemTouchHelper y;
    @m
    private ActivityResultLauncher y9;
    @m
    private GalleryInfo z;
    @m
    private ActivityResultLauncher z9;

    static {
        PostWriteActivity.W9 = new com.dcinside.app.write.PostWriteActivity.a(null);
    }

    public PostWriteActivity() {
        static final class com.dcinside.app.write.PostWriteActivity.d1 extends N implements A3.a {
            public static final com.dcinside.app.write.PostWriteActivity.d1 e;

            static {
                com.dcinside.app.write.PostWriteActivity.d1.e = new com.dcinside.app.write.PostWriteActivity.d1();
            }

            com.dcinside.app.write.PostWriteActivity.d1() {
                super(0);
            }

            @l
            public final v0 b() {
                v0 v00 = new v0(null);
                v00.v();
                return v00;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class m0 extends N implements A3.a {
            final PostWriteActivity e;

            m0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(0);
            }

            @l
            public final Boolean b() {
                return this.e.A == null ? false : true;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        public static final class m1 implements TextWatcher {
            final PostWriteActivity a;

            m1(PostWriteActivity postWriteActivity0) {
                this.a = postWriteActivity0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(@m Editable editable0) {
                if(editable0 != null && editable0.length() > 0) {
                    this.a.c6();
                }
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
            }
        }


        @s0({"SMAP\nPostWriteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$memoTextChangeWatcher$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,4099:1\n177#2,9:4100\n*S KotlinDebug\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$memoTextChangeWatcher$1\n*L\n366#1:4100,9\n*E\n"})
        public static final class n0 implements com.dcinside.rich.c {
            public final class com.dcinside.app.write.PostWriteActivity.n0.a {
                public static final int[] a;

                static {
                    int[] arr_v = new int[com.dcinside.rich.b.values().length];
                    try {
                        arr_v[com.dcinside.rich.b.a.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.dcinside.rich.b.b.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    com.dcinside.app.write.PostWriteActivity.n0.a.a = arr_v;
                }
            }

            final PostWriteActivity a;

            n0(PostWriteActivity postWriteActivity0) {
                this.a = postWriteActivity0;
                super();
            }

            @Override  // com.dcinside.rich.c
            public void a(@l RichEditText richEditText0, @m CharSequence charSequence0, int v, int v1, int v2) {
                L.p(richEditText0, "view");
            }

            @Override  // com.dcinside.rich.c
            public void b(@l RichEditText richEditText0, @m Editable editable0) {
                L.p(richEditText0, "view");
                if(editable0 == null) {
                    return;
                }
                if(this.a.O6() < 0 || editable0.length() < this.a.O6()) {
                    return;
                }
                try {
                    editable0.delete(0, this.a.O6());
                    this.a.B9(-1);
                }
                catch(Exception unused_ex) {
                }
            }

            @Override  // com.dcinside.rich.c
            public void c(@l RichEditText richEditText0, @m CharSequence charSequence0, int v, int v1, int v2) {
                L.p(richEditText0, "view");
                if(charSequence0 == null) {
                    return;
                }
                switch(richEditText0.getLastAction()) {
                    case 1: {
                        Matcher matcher0 = Yk.a.r().matcher(charSequence0);
                        if(matcher0.find()) {
                            int v3 = matcher0.start();
                            int v4 = matcher0.end();
                            String s = charSequence0.subSequence(v3, v4).toString();
                            this.a.i9(s, charSequence0, v4);
                        }
                        break;
                    }
                    case 2: {
                        Matcher matcher1 = Yk.a.r().matcher(charSequence0);
                        if(matcher1.find()) {
                            String s1 = matcher1.group(1);
                            if(s1 != null) {
                                int v5 = matcher1.start(1);
                                int v6 = matcher1.end(1);
                                String[] arr_s = null;
                                Editable editable0 = charSequence0 instanceof Editable ? ((Editable)charSequence0) : null;
                                if(editable0 != null) {
                                    arr_s = (String[])editable0.getSpans(v5, v6, String.class);
                                }
                                if((arr_s == null || arr_s.length == 0) && richEditText0.getSelectionStart() > v5) {
                                    this.a.i9(s1, charSequence0, v6);
                                }
                            }
                        }
                    }
                }
                if(charSequence0.length() > 0) {
                    this.a.c6();
                    if(!L.g(richEditText0.getHint(), "내용")) {
                        richEditText0.setHint("내용");
                        this.a.L.E();
                    }
                }
                this.a.m6();
            }
        }


        static final class o0 extends N implements A3.a {
            final PostWriteActivity e;

            o0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(0);
            }

            @l
            public final com.dcinside.app.write.menu.ai.model.a b() {
                return new com.dcinside.app.write.menu.ai.model.a(true, this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        public static final class q0 implements TextWatcher {
            final PostWriteActivity a;

            q0(PostWriteActivity postWriteActivity0) {
                this.a = postWriteActivity0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(@m Editable editable0) {
                this.a.V5();
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
            }
        }


        static final class v extends N implements A3.a {
            final PostWriteActivity e;

            v(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(0);
            }

            @m
            public final String b() {
                PostModify postModify0 = this.e.A;
                if(postModify0 != null) {
                    String s = postModify0.J();
                    if(s != null) {
                        return s;
                    }
                }
                GalleryInfo galleryInfo0 = this.e.z;
                return galleryInfo0 == null ? null : galleryInfo0.r();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.dcinside.app.write.PostWriteActivity.w extends N implements A3.a {
            final PostWriteActivity e;

            com.dcinside.app.write.PostWriteActivity.w(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(0);
            }

            @l
            public final Long invoke() {
                PostModify postModify0 = this.e.A;
                if(postModify0 != null) {
                    return postModify0.S();
                }
                GalleryInfo galleryInfo0 = this.e.z;
                return galleryInfo0 == null ? 0L : galleryInfo0.D();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }


        static final class x extends N implements A3.a {
            final PostWriteActivity e;

            x(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(0);
            }

            @l
            public final Long invoke() {
                PostModify postModify0 = this.e.A;
                if(postModify0 != null) {
                    return (long)postModify0.P();
                }
                GalleryInfo galleryInfo0 = this.e.z;
                return galleryInfo0 == null ? 0L : ((long)galleryInfo0.C());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }

        this.B = -1;
        this.E = -1;
        this.F = E.a(new m0(this));
        this.G = E.a(new com.dcinside.app.write.PostWriteActivity.w(this));
        this.H = E.a(new x(this));
        this.I = E.a(new v(this));
        this.L = new d1(this);
        this.M = new com.dcinside.app.dccon.c();
        this.O = new com.dcinside.app.write.PostWriteActivity.b(this);
        this.P = new h1(this, this, this);
        this.X = new com.dcinside.app.write.PostWriteActivity.c(this);
        this.S8 = new rx.subscriptions.b();
        this.T8 = new ArrayList();
        this.W8 = (g1 g10) -> {
            L.p(this, "this$0");
            this.E7(g10, true);
        };
        this.d9 = rx.g.M2(Math.max(60L, jl.a.R()), TimeUnit.SECONDS);
        this.g9 = true;
        this.h9 = new m1(this);
        this.i9 = new q0(this);
        this.j9 = new n0(this);
        this.k9 = -1;
        this.l9 = -1L;
        this.x9 = new PostTempActivityResult(this);
        this.C9 = -1;
        this.N9 = E.a(new o0(this));
        this.O9 = E.a(com.dcinside.app.write.PostWriteActivity.d1.e);
        this.Q9 = (g1 g10) -> {
            L.p(this, "this$0");
            this.P9 = g10;
        };
    }

    private final void A5() {
        String s2;
        b0 b00 = this.x;
        String s = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        Editable editable0 = b00.n.getText();
        if(editable0 == null) {
            s2 = null;
        }
        else {
            String s1 = editable0.toString();
            s2 = s1 == null ? null : kotlin.text.v.G5(s1).toString();
        }
        if(s2 != null && s2.length() != 0) {
            f f0 = new f();
            f0.s((this.J6().x() ? "DPM++ 2M" : "Euler"));
            f0.t(true);
            AiModelItem aiModelItem0 = this.J9;
            if(aiModelItem0 != null) {
                com.dcinside.app.write.menu.ai.type.a a0 = aiModelItem0.c();
                if(a0 != null) {
                    s = a0.e();
                }
            }
            f0.l(s);
            f0.n(s2);
            this.c9(f0, 0, true);
            return;
        }
        com.dcinside.app.internal.c.v(this, 0x7F1505A8);  // string:make_ai_image_need_prompt "프롬프트를 입력해 주세요."
    }

    // 检测为 Lambda 实现
    private static final void A6(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    private final void A7(q q0) {
        static final class y0 extends N implements Function1 {
            public static final y0 e;

            static {
                y0.e = new y0();
            }

            y0() {
                super(1);
            }

            public final V a(s s0) {
                return r0.a(s0, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((s)object0));
            }
        }

        int v = this.M6();
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        ViewHolder recyclerView$ViewHolder0 = b00.w0.findViewHolderForAdapterPosition(v);
        if(recyclerView$ViewHolder0 instanceof y2) {
            j j0 = ((y2)recyclerView$ViewHolder0).A();
            if(j0 != null) {
                j0.k();
            }
            rx.g g0 = uk.gk(q0.a()).g3((Object object0) -> {
                L.p(y0.e, "$tmp0");
                return (V)y0.e.invoke(object0);
            });
            L.o(g0, "map(...)");
            this.B(g0);
        }
    }

    private final void A8() {
        Dl.E(this, (this.p9 ? 0x7F150BC1 : 0x7F150BC0), 0);  // string:write_post_fix_enabled "고정글이 설정되었습니다."
    }

    private final void A9(String s) {
        this.o9 = s;
        this.I8();
    }

    @Override  // com.dcinside.app.write.h1$c
    public void B(@l rx.g g0) {
        static final class I0 extends N implements Function1 {
            final PostWriteActivity e;

            I0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final Boolean a(V v0) {
                return Boolean.valueOf(this.e.q1());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((V)object0));
            }
        }


        static final class J0 extends N implements Function1 {
            final PostWriteActivity e;

            J0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(V v0) {
                boolean z;
                String s1;
                dl dl0 = dl.a;
                B b0 = this.e.U8;
                String s = "";
                if(b0 == null) {
                    s1 = "";
                }
                else {
                    s1 = b0.r6();
                    if(s1 == null) {
                        s1 = "";
                    }
                }
                long v1 = dl0.J(s1);
                if(!dl0.K2() || v1 <= System.currentTimeMillis()) {
                    z = false;
                }
                else {
                    B b1 = this.e.U8;
                    if(b1 == null) {
                        z = false;
                    }
                    else {
                        String s2 = b1.j6();
                        z = s2 == null || s2.length() <= 0 ? false : true;
                    }
                }
                com.dcinside.app.realm.k0.a k0$a0 = k0.r;
                L.m(v0);
                k0 k00 = k0$a0.g(v0, z);
                b0 b00 = this.e.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                L.o(b00.w0, "postWriteRecycler");
                int v2 = this.e.M6();
                ViewHolder recyclerView$ViewHolder0 = b00.w0.findViewHolderForAdapterPosition(v2);
                if(recyclerView$ViewHolder0 instanceof y2) {
                    s = String.valueOf(((y2)recyclerView$ViewHolder0).x().getText());
                }
                if(v2 >= 0) {
                    Matcher matcher0 = Yk.a.j().matcher(s);
                    if(matcher0.find()) {
                        if(v2 != this.e.M6()) {
                            return;
                        }
                        if(L.g(s, "#" + matcher0.group(1))) {
                            this.e.L.S().remove(v2);
                            this.e.L.S().add(v2, k00);
                            this.e.L.notifyItemChanged(v2);
                        }
                        else if(recyclerView$ViewHolder0 instanceof y2) {
                            this.e.L.S().add(v2 + 1, k00);
                            String s3 = String.valueOf(((y2)recyclerView$ViewHolder0).x().getText());
                            ((y2)recyclerView$ViewHolder0).w().setVisibility(8);
                            String s4 = s3.substring(0, matcher0.start());
                            L.o(s4, "substring(...)");
                            ((y2)recyclerView$ViewHolder0).x().setText(s4);
                            Editable editable0 = ((y2)recyclerView$ViewHolder0).x().getText();
                            ((y2)recyclerView$ViewHolder0).x().setSelection((editable0 == null ? 0 : editable0.length()));
                            this.e.L.notifyItemChanged(v2 + 1);
                            if(matcher0.end(1) < s3.length()) {
                                String s5 = s3.substring(matcher0.end(1), s3.length());
                                L.o(s5, "substring(...)");
                                SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(kotlin.text.v.G5(s5).toString());
                                k0 k01 = k0$a0.o(com.dcinside.rich.html.a.a.h(spannableStringBuilder0, 1));
                                this.e.L.S().add(v2 + 2, k01);
                                this.e.L.notifyItemChanged(v2 + 2);
                            }
                        }
                    }
                    else {
                        this.e.L.S().add(v2 + 1, k00);
                        this.e.L.notifyItemInserted(v2 + 1);
                    }
                }
                else {
                    this.e.L.S().add(k00);
                    this.e.L.notifyItemInserted(this.e.L.S().size() - 1);
                }
                if(ll.F()) {
                    ll.E(false);
                    Dl.D(this.e, 0x7F150434);  // string:guide_move_image "이미지를 길게 누르면 이동할 수 있습니다."
                }
                this.e.L.p0(new int[0]);
                this.e.v6();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((V)object0));
                return S0.a;
            }
        }

        L.p(g0, "observable");
        if(!kl.a(new o[]{this.N8})) {
            return;
        }
        if(((long)this.L.O()) >= this.F6()) {
            String s = this.getString(0x7F1507FE, new Object[]{this.F6()});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
            L.o(s, "getString(...)");
            Dl.G(this, s);
            return;
        }
        this.N8 = g0.T1(() -> {
            L.p(this, "this$0");
            o o0 = this.N8;
            if(o0 != null) {
                o0.l();
            }
        }).Z1((Object object0) -> {
            L.p(new I0(this), "$tmp0");
            return (Boolean)new I0(this).invoke(object0);
        }).y5((Object object0) -> {
            L.p(new J0(this), "$tmp0");
            new J0(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            timber.log.b.a.y(throwable0);
            Dl.G(this, throwable0.getMessage());
        });
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.P.setVisibility(8);
    }

    private final void B5(AutoImageData autoImageData0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$applyAutoImage$1", f = "PostWriteActivity.kt", i = {}, l = {1073}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final PostWriteActivity l;
            final AutoImage m;

            k(PostWriteActivity postWriteActivity0, AutoImage autoImage0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                this.m = autoImage0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new k(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((k)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        Set set0 = kotlin.collections.k0.f("");
                        this.k = 1;
                        return PostWriteActivity.n5(this.l, set0, 0, false, null, false, true, this.m.l(), this, 8, null) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$applyAutoImage$2", f = "PostWriteActivity.kt", i = {}, l = {0x43F}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.l extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final PostWriteActivity l;
            final AutoImage m;

            com.dcinside.app.write.PostWriteActivity.l(PostWriteActivity postWriteActivity0, AutoImage autoImage0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                this.m = autoImage0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.l(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.write.PostWriteActivity.l)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        Set set0 = kotlin.collections.k0.f("");
                        this.k = 1;
                        return PostWriteActivity.n5(this.l, set0, 0, false, null, false, true, this.m.l(), this, 8, null) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$applyAutoImage$3", f = "PostWriteActivity.kt", i = {}, l = {1105}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.m extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final PostWriteActivity l;
            final String m;
            final AutoImage n;

            com.dcinside.app.write.PostWriteActivity.m(PostWriteActivity postWriteActivity0, String s, AutoImage autoImage0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                this.m = s;
                this.n = autoImage0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.m(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.write.PostWriteActivity.m)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        Set set0 = kotlin.collections.k0.f(this.m);
                        this.k = 1;
                        return PostWriteActivity.n5(this.l, set0, 0, false, null, false, true, this.n.l(), this, 8, null) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        b0 b00;
        this.L.q0(autoImageData0);
        this.F5();
        boolean z = autoImageData0.w();
        Iterable iterable0 = autoImageData0.o();
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        Iterator iterator0 = iterable0.iterator();
        while(true) {
            b00 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            iterator0.next();
            arrayList0.add("");
        }
        if(arrayList0.isEmpty()) {
            if(!dl.a.I2() && autoImageData0.s()) {
                k0 k00 = com.dcinside.app.realm.k0.a.e(k0.r, "post_write_empty_auto_image", null, 0, 6, null);
                ArrayList arrayList1 = this.L.S();
                int v = this.M6();
                int v1 = v < 0 ? arrayList1.size() : v + 1;
                arrayList1.add(v1, k00);
                this.L.notifyItemInserted(v1);
                b0 b01 = this.x;
                if(b01 == null) {
                    L.S("binding");
                }
                else {
                    b00 = b01;
                }
                b00.w0.scrollToPosition(v1);
                this.G9("", "");
            }
            return;
        }
        if(z) {
            kotlin.random.f.a f$a0 = kotlin.random.f.a;
            f$a0.c();
            if(!arrayList0.isEmpty()) {
                AutoImage autoImage0 = (AutoImage)u.M4(autoImageData0.o(), f$a0);
                if(autoImage0 != null) {
                    kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new k(this, autoImage0, null), 2, null);
                    return;
                }
            }
            return;
        }
        Object object0 = null;
        for(Object object1: autoImageData0.o()) {
            if(((AutoImage)object1).l() == autoImageData0.t()) {
                object0 = object1;
                break;
            }
        }
        AutoImage autoImage1 = (AutoImage)object0;
        if(autoImage1 == null) {
            autoImage1 = (AutoImage)u.G2(autoImageData0.o());
        }
        if(autoImage1 == null || !kotlin.text.v.v2("", "http", false, 2, null)) {
            return;
        }
        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.write.PostWriteActivity.m(this, "", autoImage1, null), 2, null);
    }

    private final int B6(AppBarLayout appBarLayout0) {
        int v = this.B;
        if(v != -1) {
            return v;
        }
        int v1 = appBarLayout0.getChildCount() - 1;
        int v2 = 0;
        while(-1 < v1) {
            View view0 = appBarLayout0.getChildAt(v1);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            LayoutParams appBarLayout$LayoutParams0 = (LayoutParams)viewGroup$LayoutParams0;
            int v3 = view0.getMeasuredHeight();
            int v4 = appBarLayout$LayoutParams0.c();
            if((v4 & 5) == 5) {
                int v5 = v2 + (appBarLayout$LayoutParams0.topMargin + appBarLayout$LayoutParams0.bottomMargin);
                if((v4 & 8) != 0) {
                    v3 = ViewCompat.j0(view0);
                }
                v2 = v5 + v3;
            }
            else if(v2 > 0) {
                break;
            }
            --v1;
        }
        this.B = v2;
        return v2;
    }

    // 检测为 Lambda 实现
    private static final V B7(Function1 function10, Object object0) [...]

    private final void B8(Intent intent0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onImagePickerActivityResult$1", f = "PostWriteActivity.kt", i = {}, l = {0x914, 0x917}, m = "invokeSuspend", n = {}, s = {})
        static final class Q0 extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final PostWriteActivity l;
            final Intent m;
            final int n;
            final String o;

            Q0(PostWriteActivity postWriteActivity0, Intent intent0, int v, String s, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                this.m = intent0;
                this.n = v;
                this.o = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new Q0(this.l, this.m, this.n, this.o, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((Q0)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onImagePickerActivityResult$1$1", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.write.PostWriteActivity.Q0.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final PostWriteActivity l;

                    com.dcinside.app.write.PostWriteActivity.Q0.a(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                        this.l = postWriteActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.write.PostWriteActivity.Q0.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.write.PostWriteActivity.Q0.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        PostWriteActivity.t9(this.l, false, false, null, 6, null);
                        return S0.a;
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onImagePickerActivityResult$1$job$1", f = "PostWriteActivity.kt", i = {}, l = {0x905, 0x906}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.write.PostWriteActivity.Q0.b extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final PostWriteActivity l;

                    com.dcinside.app.write.PostWriteActivity.Q0.b(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                        this.l = postWriteActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.write.PostWriteActivity.Q0.b(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.write.PostWriteActivity.Q0.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onImagePickerActivityResult$1$job$1$1", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class com.dcinside.app.write.PostWriteActivity.Q0.b.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                            int k;
                            final PostWriteActivity l;

                            com.dcinside.app.write.PostWriteActivity.Q0.b.a(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                                this.l = postWriteActivity0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                                return new com.dcinside.app.write.PostWriteActivity.Q0.b.a(this.l, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                                return ((com.dcinside.app.write.PostWriteActivity.Q0.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.k != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                PostWriteActivity.t9(this.l, true, false, null, 6, null);
                                return S0.a;
                            }
                        }

                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.k = 1;
                                if(a0.b(200L, this) == object1) {
                                    return object1;
                                }
                                break;
                            }
                            case 1: {
                                f0.n(object0);
                                break;
                            }
                            case 2: {
                                f0.n(object0);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        com.dcinside.app.write.PostWriteActivity.Q0.b.a postWriteActivity$Q0$b$a0 = new com.dcinside.app.write.PostWriteActivity.Q0.b.a(this.l, null);
                        this.k = 2;
                        return i.h(h0.e(), postWriteActivity$Q0$b$a0, this) == object1 ? object1 : S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        kotlinx.coroutines.I0 i00 = kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this.l), h0.c(), null, new com.dcinside.app.write.PostWriteActivity.Q0.b(this.l, null), 2, null);
                        Set set0 = this.m.getBooleanExtra("extra_take_image_from_android", false) ? Gk.t(this.m) : this.m.getStringArrayListExtra("intent_path");
                        kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                        if(set0 == null) {
                            com.dcinside.app.write.PostWriteActivity.Q0.a postWriteActivity$Q0$a0 = new com.dcinside.app.write.PostWriteActivity.Q0.a(this.l, null);
                            this.k = 2;
                            if(i.h(h0.e(), postWriteActivity$Q0$a0, this) == object1) {
                                return object1;
                            }
                        }
                        else {
                            this.k = 1;
                            if(PostWriteActivity.n5(this.l, set0, this.n, true, this.o, false, false, 0, this, 0x70, null) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
                    }
                    case 1: 
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        String s = this.K6();
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.w0, "postWriteRecycler");
        int v = O2.e(b00.w0);
        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new Q0(this, intent0, v, s, null), 2, null);
    }

    public final void B9(int v) {
        this.k9 = v;
    }

    private final void C5(Intent intent0) {
        Object object12;
        Map map4;
        Map map3;
        k0 k00;
        P p0;
        this.getWindow().setSoftInputMode(2);
        PostModify postModify0 = (PostModify)IntentCompat.d(intent0, "com.dcinside.app.extra.MODIFY", PostModify.class);
        if(postModify0 == null) {
            return;
        }
        AutoImageData autoImageData0 = (AutoImageData)IntentCompat.d(intent0, "com.dcinside.app.extra.AUTO_IMAGE", AutoImageData.class);
        if(autoImageData0 != null) {
            this.L.q0(autoImageData0);
        }
        this.A = postModify0;
        this.i7(intent0);
        b0 b00 = this.x;
        Object object0 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.y0.setText(postModify0.X());
        this.u9(postModify0.G());
        this.z9(postModify0.Z());
        this.w9(postModify0.a0());
        this.L.D();
        ArrayList arrayList0 = this.L.S();
        List list0 = postModify0.U();
        List list1 = postModify0.N();
        List list2 = postModify0.Y();
        if(list0 != null && list1 != null) {
            for(Object object1: list0) {
                Map map0 = (Map)object1;
                if(map0 == null) {
                    object12 = object0;
                }
                else {
                    String s = this.H6(map0);
                    if(s != null) {
                        String s1 = (String)map0.get(s);
                        if(s1 != null && !O2.g(s1)) {
                            if(m0.a.a.i(s1)) {
                                arrayList0.add(k0.r.j());
                                continue;
                            }
                            else {
                                String s2 = (String)map0.get("dccon_idx");
                                if(s2 != null) {
                                    List list3 = kotlin.text.v.V4(s2, new String[]{"|dccon|"}, false, 0, 6, null);
                                    Integer integer0 = kotlin.text.v.b1(((String)u.B2(list3)));
                                    int v = integer0 == null ? -1 : ((int)integer0);
                                    Integer integer1 = kotlin.text.v.b1(((String)u.p3(list3)));
                                    int v1 = integer1 == null ? -1 : ((int)integer1);
                                    if(v > 0) {
                                        boolean z = L.g(map0.get("dccon_type"), "bigdccon");
                                        if(list3.size() > 1) {
                                            V v2 = r0.a(v, v1);
                                            arrayList0.add(k0.r.f(s1, v2, z));
                                        }
                                        else {
                                            V v3 = r0.a(v, object0);
                                            arrayList0.add(k0.r.f(s1, v3, z));
                                        }
                                        continue;
                                    }
                                }
                                String s3 = (String)map0.get("tag_value");
                                int v4 = 0;
                                if(s3 != null) {
                                    if(L.g(s3, "Dc_App_Vote")) {
                                        List list4 = postModify0.W();
                                        if(list4 != null && !list4.isEmpty() == 1) {
                                            Map map1 = (Map)list4.get(0);
                                            if(map1 == null) {
                                                p0 = object0;
                                            }
                                            else {
                                                p0 = new P(null, null, null, false, null, false, null, null, null, null, null, 0x7FF, null);
                                                p0.r(((String)map1.get("vote_confirm")));
                                                p0.v(((String)map1.get("title")));
                                                p0.n(((String)map1.get("end_date")));
                                            }
                                            if(p0 != null) {
                                                if(this.q7()) {
                                                    PostModify postModify1 = this.A;
                                                    Integer integer2 = postModify1 == null ? object0 : postModify1.V();
                                                    p0.u(integer2);
                                                }
                                                String s4 = uk.a.D(p0);
                                                arrayList0.add(k0.r.l(s4));
                                                continue;
                                            }
                                        }
                                    }
                                    String s5 = "";
                                    if(kotlin.text.v.v2(s3, "Dc_App_zzal", false, 2, object0)) {
                                        Integer integer3 = kotlin.text.v.b1(kotlin.text.v.r5(s3, "Dc_App_zzal_", ((String)object0), 2, object0));
                                        int v5 = integer3 == null ? -1 : ((int)integer3);
                                        List list5 = autoImageData0 == null ? object0 : autoImageData0.o();
                                        if(list5 == null || list5.isEmpty()) {
                                            continue;
                                        }
                                        Iterable iterable0 = autoImageData0.o();
                                        ArrayList arrayList1 = new ArrayList(u.b0(iterable0, 10));
                                        for(Object object2: iterable0) {
                                            arrayList1.add(((AutoImage)object2).l());
                                        }
                                        for(Object object3: arrayList1) {
                                            if(((Number)object3).intValue() != v5) {
                                                continue;
                                            }
                                            goto label_99;
                                        }
                                        object3 = object0;
                                    label_99:
                                        Integer integer4 = (Integer)object3;
                                        if(integer4 == null || integer4.intValue() < 0) {
                                            integer4 = object0;
                                        }
                                        if(integer4 != null) {
                                            k00 = k0.r.c(s1, v5);
                                        }
                                        else if(autoImageData0.w()) {
                                            AutoImage autoImage0 = (AutoImage)u.M4(autoImageData0.o(), kotlin.random.f.a);
                                            com.dcinside.app.realm.k0.a k0$a0 = k0.r;
                                            if(autoImage0 != null) {
                                                v4 = autoImage0.l();
                                            }
                                            k00 = k0$a0.d("post_write_changed_auto_image", "", v4);
                                        }
                                        else {
                                            for(Object object4: autoImageData0.o()) {
                                                if(((AutoImage)object4).l() != autoImageData0.t()) {
                                                    continue;
                                                }
                                                goto label_118;
                                            }
                                            object4 = object0;
                                        label_118:
                                            AutoImage autoImage1 = (AutoImage)object4;
                                            if(autoImage1 == null) {
                                                autoImage1 = (AutoImage)u.G2(autoImageData0.o());
                                            }
                                            com.dcinside.app.realm.k0.a k0$a1 = k0.r;
                                            if(autoImage1 != null) {
                                                v4 = autoImage1.l();
                                            }
                                            k00 = k0$a1.d("post_write_changed_auto_image", "", v4);
                                        }
                                        if(k00 == null) {
                                            continue;
                                        }
                                        arrayList0.add(k00);
                                        continue;
                                    }
                                    else if(kotlin.text.v.v2(s3, "Dc_App_Movie", false, 2, object0)) {
                                        if(list2 == null) {
                                            map3 = object0;
                                        }
                                        else {
                                            List list6 = list2.isEmpty() ? object0 : list2;
                                            if(list6 != null) {
                                                for(Object object5: list6) {
                                                    Map map2 = (Map)object5;
                                                    String s6 = map2 == null ? object0 : ((String)map2.get(s));
                                                    if(s6 == null) {
                                                        continue;
                                                    }
                                                    goto label_146;
                                                }
                                                object5 = object0;
                                            label_146:
                                                map3 = (Map)object5;
                                            }
                                        }
                                        if(map3 == null) {
                                            arrayList0.add(k0.r.s(s1, ((VideoInfoData)object0)));
                                        }
                                        else {
                                            String s7 = (String)map3.get("mv_thumb");
                                            if(s7 != null) {
                                                s5 = s7;
                                            }
                                            Object object6 = map3.get("mv_token");
                                            Object object7 = map3.get("mv_desc");
                                            Object object8 = map3.get("mv_tags");
                                            String s8 = (String)map3.get("is_allow_down");
                                            VideoInfoData videoInfoData0 = new VideoInfoData(0, 0, null, ((String)object6), ((String)map3.get(s)), s5, ((String)object7), ((String)object8), L.g(s8, "1"), 7, null);
                                            arrayList0.add(k0.r.s(s5, videoInfoData0));
                                        }
                                        continue;
                                    }
                                    else if(kotlin.text.v.v2(s3, "Dc_App_Ai", false, 2, object0)) {
                                        List list7 = postModify0.F();
                                        if(list7 == null) {
                                            map4 = object0;
                                        }
                                        else {
                                            List list8 = u.s2(list7);
                                            if(list8 != null) {
                                                for(Object object9: list8) {
                                                    String s9 = (String)((Map)object9).get(s);
                                                    if(s9 == null || s9.length() <= 0) {
                                                        continue;
                                                    }
                                                    goto label_174;
                                                }
                                                object9 = object0;
                                            label_174:
                                                map4 = (Map)object9;
                                            }
                                        }
                                        if(map4 == null) {
                                            continue;
                                        }
                                        String s10 = (String)map4.get(s);
                                        boolean z1 = L.g(map4.get("hide_prompt"), "1");
                                        Object object10 = map4.get("ct_img_url");
                                        arrayList0.add(com.dcinside.app.realm.k0.a.b(k0.r, (s10 == null ? "" : s10), z1, s1, ((String)object10), true, false, 0x20, null));
                                        continue;
                                    }
                                    else {
                                        for(Object object11: list1) {
                                            Map map5 = (Map)object11;
                                            String s11 = map5 == null ? object0 : ((String)map5.get(s));
                                            if(s11 != null) {
                                                String s12 = (String)map5.get("file_size");
                                                com.dcinside.app.realm.k0.a k0$a2 = k0.r;
                                                L.m(s3);
                                                if(s12 == null) {
                                                    s12 = "0";
                                                }
                                                s3 = k0$a2.O(new String[]{s3, s12, s11});
                                                object0 = null;
                                            }
                                        }
                                        if(m0.a.a.k(s3)) {
                                            boolean z2 = L.g(map0.get("comment"), "1");
                                            L.m(s3);
                                            arrayList0.add(k0.r.r(s1, s3, z2));
                                            goto label_226;
                                        }
                                    }
                                }
                                String s13 = Yk.h(s1);
                                if(s13 == null) {
                                    com.dcinside.app.voice.a a0 = com.dcinside.app.voice.a.d.a(s1, com.dcinside.app.voice.a.e, false);
                                    String s14 = a0 == null ? null : a0.b();
                                    if(s14 == null) {
                                        String s17 = Dl.M(s1);
                                        L.m(s17);
                                        if(kotlin.text.v.v2(s17, "{{_OG_START::", false, 2, null)) {
                                            com.dcinside.app.model.N n0 = com.dcinside.app.write.i.a.f(s17);
                                            if(n0 != null) {
                                                arrayList0.add(k0.r.k(n0));
                                            }
                                            object0 = null;
                                            continue;
                                        }
                                        else {
                                            org.jsoup.nodes.f f0 = org.jsoup.g.m(s17);
                                            if(f0.E1("dc_series").size() > 0) {
                                                object12 = null;
                                                arrayList0.add(k0.r.n(s17, null));
                                            }
                                            else {
                                                object12 = null;
                                                for(Object object13: f0.E2("a")) {
                                                    ((org.jsoup.nodes.o)object13).i0(new y(((org.jsoup.nodes.o)object13).S2()));
                                                }
                                                String s18 = f0.c3().T1();
                                                L.o(s18, "html(...)");
                                                String s19 = kotlin.text.v.l2(s18, "\n", "", false, 4, null);
                                                arrayList0.add(k0.r.p(s19));
                                            }
                                        }
                                    }
                                    else {
                                        String s15 = a0.c();
                                        if(s15 != null) {
                                            if(kotlin.text.v.x3(s15)) {
                                                s15 = null;
                                            }
                                            if(s15 != null) {
                                                arrayList0.add(k0.r.o(s15));
                                            }
                                        }
                                        com.dcinside.app.realm.k0.a k0$a3 = k0.r;
                                        arrayList0.add(k0$a3.t(s14));
                                        String s16 = a0.d();
                                        if(s16 != null) {
                                            if(kotlin.text.v.x3(s16)) {
                                                s16 = null;
                                            }
                                            if(s16 != null) {
                                                arrayList0.add(k0$a3.o(s16));
                                            }
                                        }
                                    label_226:
                                        object0 = null;
                                        continue;
                                    }
                                }
                                else {
                                    arrayList0.add(k0.r.u(s13));
                                    goto label_226;
                                }
                            }
                        }
                    }
                }
                object0 = object12;
            }
        }
    }

    private final com.dcinside.app.type.m C6() {
        PostModify postModify0 = this.A;
        if(postModify0 != null) {
            com.dcinside.app.type.m m0 = postModify0.I();
            if(m0 != null) {
                return m0;
            }
        }
        return this.z == null ? com.dcinside.app.type.m.g : this.z.q();
    }

    private final void C7() {
        H4 h40 = this.s9;
        if(h40 != null) {
            h40.dismissAllowingStateLoss();
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = H4.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.post.fragments.H4");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.post.fragments.VoiceCopyRightFragment");
        }
        ((H4)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
        ((H4)fragment0).show(fragmentManager0, "com.dcinside.app.post.fragments.H4");
        this.s9 = (H4)fragment0;
    }

    // 检测为 Lambda 实现
    private static final Boolean C8(Function1 function10, Object object0) [...]

    private final void C9(Intent intent0) {
        b0 b00 = null;
        if(this.q7()) {
            String s = intent0.getStringExtra("com.dcinside.app.extra.MODIFY_PW");
            if(m0.a.a.k(s)) {
                b0 b01 = this.x;
                if(b01 == null) {
                    L.S("binding");
                    b01 = null;
                }
                L.o(b01.W, "postWriteGuest");
                b01.W.setVisibility(0);
                b0 b02 = this.x;
                if(b02 == null) {
                    L.S("binding");
                    b02 = null;
                }
                String s1 = intent0.getStringExtra("com.dcinside.app.extra.MODIFY_NICK");
                b02.n0.setText(s1);
                b02.n0.setEnabled(false);
                vk.h(0x7F04032A, new View[]{b02.n0});  // attr:icTintNormal
                b0 b03 = this.x;
                if(b03 == null) {
                    L.S("binding");
                    b03 = null;
                }
                b03.o0.setText(s);
                b03.o0.setEnabled(false);
                vk.h(0x7F04032A, new View[]{b03.o0});  // attr:icTintNormal
                b0 b04 = this.x;
                if(b04 == null) {
                    L.S("binding");
                }
                else {
                    b00 = b04;
                }
                L.o(b00.I, "postWriteCode");
                b00.I.setVisibility(8);
                return;
            }
            b0 b05 = this.x;
            if(b05 == null) {
                L.S("binding");
                b05 = null;
            }
            L.o(b05.W, "postWriteGuest");
            b05.W.setVisibility(8);
            b0 b06 = this.x;
            if(b06 == null) {
                L.S("binding");
            }
            else {
                b00 = b06;
            }
            L.o(b00.I, "postWriteCode");
            b00.I.setVisibility(8);
            return;
        }
        if(this.U8 == null) {
            b0 b07 = this.x;
            if(b07 == null) {
                L.S("binding");
                b07 = null;
            }
            L.o(b07.W, "postWriteGuest");
            b07.W.setVisibility(0);
            com.dcinside.app.realm.t t0 = com.dcinside.app.realm.t.i.a();
            String s2 = this.z == null ? null : this.z.c();
            if(s2 != null && s2.length() != 0) {
                b0 b08 = this.x;
                if(b08 == null) {
                    L.S("binding");
                    b08 = null;
                }
                b08.n0.setText((this.z == null ? null : this.z.c()));
                b08.n0.setEnabled(false);
                vk.h(0x7F04032A, new View[]{b08.n0});  // attr:icTintNormal
                b0 b09 = this.x;
                if(b09 == null) {
                    L.S("binding");
                    b09 = null;
                }
                b09.X.setVisibility(0);
                if(t0.R5()) {
                    b0 b010 = this.x;
                    if(b010 == null) {
                        L.S("binding");
                        b010 = null;
                    }
                    String s3 = t0.T5();
                    b010.o0.setText(s3);
                    b010.o0.setEnabled(false);
                    vk.h(0x7F04032A, new View[]{b010.o0});  // attr:icTintNormal
                }
                else {
                    b0 b011 = this.x;
                    if(b011 == null) {
                        L.S("binding");
                        b011 = null;
                    }
                    String s4 = t0.V5();
                    b011.o0.setText(s4);
                }
            }
            else if(t0.R5()) {
                b0 b012 = this.x;
                if(b012 == null) {
                    L.S("binding");
                    b012 = null;
                }
                String s5 = t0.S5();
                b012.n0.setText(s5);
                b012.n0.setEnabled(false);
                vk.h(0x7F04032A, new View[]{b012.n0});  // attr:icTintNormal
                b0 b013 = this.x;
                if(b013 == null) {
                    L.S("binding");
                    b013 = null;
                }
                String s6 = t0.T5();
                b013.o0.setText(s6);
                b013.o0.setEnabled(false);
                vk.h(0x7F04032A, new View[]{b013.o0});  // attr:icTintNormal
            }
            else {
                if(!dl.a.A2() || !this.G5()) {
                    b0 b015 = this.x;
                    if(b015 == null) {
                        L.S("binding");
                        b015 = null;
                    }
                    String s7 = t0.U5();
                    b015.n0.setText(s7);
                }
                else {
                    b0 b014 = this.x;
                    if(b014 == null) {
                        L.S("binding");
                        b014 = null;
                    }
                    b014.n0.setText("");
                }
                b0 b016 = this.x;
                if(b016 == null) {
                    L.S("binding");
                    b016 = null;
                }
                String s8 = t0.V5();
                b016.o0.setText(s8);
            }
            if(this.Q == null) {
                b0 b017 = this.x;
                if(b017 == null) {
                    L.S("binding");
                    b017 = null;
                }
                LinearLayout linearLayout0 = b017.I;
                b0 b018 = this.x;
                if(b018 == null) {
                    L.S("binding");
                    b018 = null;
                }
                ClearableEditText clearableEditText0 = b018.K;
                b0 b019 = this.x;
                if(b019 == null) {
                    L.S("binding");
                    b019 = null;
                }
                ImageView imageView0 = b019.J;
                b0 b020 = this.x;
                if(b020 == null) {
                    L.S("binding");
                    b020 = null;
                }
                this.Q = new e(linearLayout0, clearableEditText0, imageView0, null, b020.L);
            }
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
            GalleryInfo galleryInfo0 = this.z;
            if(galleryInfo0 != null) {
                b00 = galleryInfo0.l();
            }
            spannableStringBuilder0.append(this.getString(0x7F150836, new Object[]{b00}));  // string:quick_write_code_guide "코드 %1$d자리 입력"
            spannableStringBuilder0.append(' ');
            int v = spannableStringBuilder0.length();
            spannableStringBuilder0.append("(숫자 0은 없음)");
            spannableStringBuilder0.setSpan(new RelativeSizeSpan(0.7f), v, spannableStringBuilder0.length(), 33);
            e e0 = this.Q;
            if(e0 != null) {
                e0.d(this.z, spannableStringBuilder0);
            }
        }
        else {
            b0 b021 = this.x;
            if(b021 == null) {
                L.S("binding");
                b021 = null;
            }
            L.o(b021.W, "postWriteGuest");
            b021.W.setVisibility(8);
            b0 b022 = this.x;
            if(b022 == null) {
                L.S("binding");
            }
            else {
                b00 = b022;
            }
            L.o(b00.I, "postWriteCode");
            b00.I.setVisibility(8);
        }
    }

    private final void D5() {
        for(Object object0: jl.a.S0()) {
            List list0 = ((com.dcinside.app.model.m0)object0).a();
            if(list0 == null || !u.W1(list0, this.D6())) {
                continue;
            }
            goto label_7;
        }
        object0 = null;
    label_7:
        if(((com.dcinside.app.model.m0)object0) == null) {
            return;
        }
        this.L.A(((com.dcinside.app.model.m0)object0));
    }

    private final String D6() {
        return (String)this.I.getValue();
    }

    private final void D7() {
        int v1;
        b0 b00 = this.x;
        com.dcinside.app.head.a a0 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.a0, "postWriteLoginArrow");
        if(b00.a0.getVisibility() == 0) {
            if(this.L.L()) {
                com.dcinside.app.internal.c.v(this, 0x7F150594);  // string:make_ai_image_impossible_account "AI 이미지 등록 시 계정 전환이 불가능합니다. (삭제 후 전환 가능)"
                return;
            }
            b0 b01 = this.x;
            if(b01 == null) {
                L.S("binding");
                b01 = null;
            }
            Adapter recyclerView$Adapter0 = b01.Y.getAdapter();
            com.dcinside.app.head.a a1 = recyclerView$Adapter0 instanceof com.dcinside.app.head.a ? ((com.dcinside.app.head.a)recyclerView$Adapter0) : null;
            int v = 0;
            if(a1 == null) {
                v1 = 0;
            }
            else {
                if(a1.A()) {
                    a0 = a1;
                }
                if(a0 == null) {
                    v1 = 0;
                }
                else {
                    PostHead postHead0 = a0.z();
                    v1 = postHead0 == null ? 0 : postHead0.l();
                }
            }
            String s = this.D6();
            com.dcinside.app.type.m m0 = this.C6();
            if(this.z != null && this.z.f0()) {
                v = 1;
            }
            this.x1(1, s, m0, v1, ((boolean)(v ^ 1)));
        }
    }

    // 检测为 Lambda 实现
    private static final void D8(Function1 function10, Object object0) [...]

    private final void D9(GalleryInfo galleryInfo0) {
        static final class k1 extends N implements A3.o {
            final PostWriteActivity e;

            k1(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(2);
            }

            public final void a(@l PostHead postHead0, boolean z) {
                L.p(postHead0, "h");
                this.e.H8(postHead0, z);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PostHead)object0), ((Boolean)object1).booleanValue());
                return S0.a;
            }
        }

        PostHead postHead0 = null;
        List list0 = com.dcinside.app.realm.q.o.c((galleryInfo0 == null ? null : galleryInfo0.r()));
        com.dcinside.app.head.a a0 = com.dcinside.app.head.f.h.b(this, galleryInfo0);
        if(!list0.isEmpty()) {
            a0.F(list0);
        }
        a0.E(new k1(this));
        int v = a0.y();
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        RecyclerView recyclerView0 = b00.Y;
        L.o(recyclerView0, "postWriteHead");
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        nonPredictiveLayoutManager0.I3(true);
        recyclerView0.setLayoutManager(nonPredictiveLayoutManager0);
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        com.dcinside.app.head.a a1 = recyclerView$Adapter0 instanceof com.dcinside.app.head.a ? ((com.dcinside.app.head.a)recyclerView$Adapter0) : null;
        if(a1 != null) {
            if(!a1.A()) {
                a1 = null;
            }
            if(a1 != null) {
                postHead0 = a1.z();
            }
        }
        if(postHead0 != null) {
            a0.I(postHead0);
        }
        recyclerView0.setAdapter(a0);
        recyclerView0.setVisibility((a0.A() ? 0 : 8));
        if(v >= 0) {
            recyclerView0.smoothScrollToPosition(v);
        }
        this.H8(a0.z(), false);
    }

    private final void E5(Intent intent0) {
        GalleryInfo galleryInfo0 = (GalleryInfo)IntentCompat.d(intent0, "com.dcinside.app.extra.GALLERY_INFO", GalleryInfo.class);
        if(galleryInfo0 == null) {
            return;
        }
        AutoImageData autoImageData0 = (AutoImageData)IntentCompat.d(intent0, "com.dcinside.app.extra.AUTO_IMAGE", AutoImageData.class);
        this.z = galleryInfo0;
        this.i7(intent0);
        if(autoImageData0 != null) {
            this.B5(autoImageData0);
        }
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.R.setText(galleryInfo0.t());
        k0 k00 = k0.r.j();
        this.L.S().add(k00);
    }

    private final long E6() {
        return ((Number)this.G.getValue()).longValue();
    }

    private final void E7(g1 g10, boolean z) {
        B b0;
        if(g10 == null) {
            b0 = null;
        }
        else {
            RealmQuery realmQuery0 = g10.x4();
            if(realmQuery0 == null) {
                b0 = null;
            }
            else {
                RealmQuery realmQuery1 = realmQuery0.b0("flagChoose", Boolean.TRUE);
                b0 = realmQuery1 == null ? null : ((B)realmQuery1.r0());
            }
        }
        this.U8 = b0;
        if(b0 != null) {
            String s = b0.j6();
            String s1 = b0.r6();
            String s2 = this.D6();
            if(s2 != null && s1 != null && L.g(this.o1().c(s2, s1), Boolean.TRUE)) {
                GalleryInfo galleryInfo0 = this.z;
                if(galleryInfo0 != null) {
                    galleryInfo0.J0(s);
                }
                PostModify postModify0 = this.A;
                if(postModify0 != null) {
                    postModify0.l0(s);
                }
            }
            Intent intent0 = this.getIntent();
            L.o(intent0, "getIntent(...)");
            this.C9(intent0);
            this.Q9();
            return;
        }
        if(z) {
            this.Q5();
            return;
        }
        this.Q9();
    }

    private final void E8(View view0) {
        static final class U0 extends N implements A3.a {
            final PostWriteActivity e;

            U0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.m8();
            }
        }


        static final class V0 extends N implements A3.a {
            final PostWriteActivity e;

            V0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.n8();
            }
        }


        static final class W0 extends N implements A3.a {
            final PostWriteActivity e;

            W0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.d8();
            }
        }


        static final class X0 extends N implements A3.a {
            final PostWriteActivity e;

            X0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.p8();
            }
        }

        if(view0 == null) {
            return;
        }
        Object object0 = view0.getTag();
        b0 b00 = null;
        Integer integer0 = object0 instanceof Integer ? ((Integer)object0) : null;
        if(integer0 != null) {
            int v = (int)integer0;
            b0 b01 = this.x;
            if(b01 == null) {
                L.S("binding");
            }
            else {
                b00 = b01;
            }
            b00.P.setVisibility(8);
            this.j7(false);
            switch(com.dcinside.app.write.menu.b.e.b(v)) {
                case 1: {
                    this.W5(new U0(this));
                    break;
                }
                case 2: {
                    this.W5(new V0(this));
                    return;
                }
                case 3: {
                    this.W5(new W0(this));
                    return;
                }
                case 4: {
                    this.J7();
                    return;
                }
                case 5: {
                    this.X7();
                    return;
                }
                case 6: {
                    this.h6(new X0(this));
                    return;
                }
                case 7: {
                    this.K7();
                    return;
                }
                case 8: {
                    this.o8();
                    return;
                }
                case 9: {
                    this.h8();
                    return;
                }
                case 10: {
                    this.j8();
                    return;
                }
                case 11: {
                    this.I7();
                    return;
                }
                case 12: {
                    this.U7();
                    return;
                }
                case 13: {
                    this.k8();
                    return;
                }
                case 14: {
                    this.Y7(false);
                }
            }
        }
    }

    private final void E9() {
        if(!this.o7()) {
            this.T8();
            return;
        }
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        if(L.g(b00.u.getAdapter(), this.J6())) {
            this.Q6();
            return;
        }
        this.T8();
    }

    private final boolean F5() {
        if(this.z != null && !this.z.f()) {
            return false;
        }
        String s = Bk.F(System.currentTimeMillis());
        dl dl0 = dl.a;
        if(L.g(s, dl0.w())) {
            return false;
        }
        String s1 = B.E.k0();
        return s1 != null && s1.length() != 0 || !L.g(s, dl0.v());
    }

    private final long F6() {
        return ((Number)this.H.getValue()).longValue();
    }

    private final void F7(boolean z) {
        if(z) {
            this.P.j();
        }
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.P.setVisibility(8);
        this.L1();
    }

    private final void F8(G g0) {
        AiModelItem aiModelItem0 = g0.a();
        this.J9 = aiModelItem0;
        if(aiModelItem0 != null) {
            this.J6().y(g0.a());
            b0 b00 = this.x;
            if(b00 == null) {
                L.S("binding");
                b00 = null;
            }
            String s = this.getString(aiModelItem0.c().d());
            b00.h.setText(s);
            this.Q6();
        }
    }

    private final void F9(com.dcinside.app.realm.b b0) {
        V[] arr_v = {r0.a("EXTRA_PROMPT_POSITIVE", ""), r0.a("EXTRA_PROMPT_NEGATIVE", "")};
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = S.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.write.menu.ai.S");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.write.menu.ai.AiPromptDetailDialog");
        }
        ((S)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 2))));
        ((S)fragment0).show(fragmentManager0, "com.dcinside.app.write.menu.ai.S");
        this.R9 = (S)fragment0;
    }

    private final boolean G5() {
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        CharSequence charSequence0 = b00.R.getText();
        L.o(charSequence0, "getText(...)");
        return charSequence0.length() > 0;
    }

    @l
    public final ArrayList G6() {
        return this.T8;
    }

    public final void G7() {
        this.Y7(true);
    }

    private final void G8() {
        this.L.F();
    }

    private final void G9(String s, String s1) {
        if(L.g(s, "X")) {
            s = "__DC_GLOBAL_DEF_IMAGE_ID";
        }
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(b00.E.getText());
        int v = kotlin.text.v.s3(spannableStringBuilder0, "설정하기", 0, false, 6, null);
        if(v > -1) {
            int v1 = ContextCompat.getColor(this, 0x7F060040);  // color:ai_image_guide_accent_color
            b0 b02 = this.x;
            if(b02 == null) {
                L.S("binding");
                b02 = null;
            }
            com.dcinside.app.write.v0 v00 = (View view0) -> {
                L.p(this, "this$0");
                L.p(s, "$id");
                L.p(s1, "$galleryName");
                com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.a.b(DefaultImageSettingActivity.Q, this, s, s1, false, null, 24, null);
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                L.o(b00.D, "postWriteAutoImageGuide");
                b00.D.setVisibility(8);
            };
            b02.C.setOnClickListener(v00);
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(v1), v, spannableStringBuilder0.length(), 33);
            b0 b03 = this.x;
            if(b03 == null) {
                L.S("binding");
                b03 = null;
            }
            b03.E.setText(spannableStringBuilder0);
        }
        b0 b04 = this.x;
        if(b04 == null) {
            L.S("binding");
        }
        else {
            b01 = b04;
        }
        L.o(b01.D, "postWriteAutoImageGuide");
        b01.D.setVisibility(0);
        dl.a.q3(true);
    }

    public final void H5() {
        this.P.j();
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.P.setVisibility(8);
    }

    private final String H6(Map map0) {
        if(map0 == null) {
            return null;
        }
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            if(kotlin.text.v.v2(s, "memo_block", false, 2, null)) {
                return s;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void H7(int v) {
        this.C = v;
        Object object0 = this.L.S().get(v);
        L.o(object0, "get(...)");
        if(k0.r.B(((k0)object0)) && !k0.r.C(((k0)object0))) {
            String s = ((k0)object0).V5();
            Intent intent0 = new Intent(this, ImageEditActivity.class);
            intent0.setData(Uri.parse(s));
            this.startActivityForResult(intent0, 0x401);
        }
    }

    private final void H8(PostHead postHead0, boolean z) {
        String s2;
        int v = 0;
        if(z) {
            if(postHead0 != null) {
                String s = postHead0.m();
                if(s != null) {
                    String s1 = this.getString(0x7F1507B8, new Object[]{s});  // string:post_head_ignore_name "[%s] 말머리는 비노출 설정 상태로 글 등록 후 목록에서는 확인할 수 없습니다."
                    L.o(s1, "getString(...)");
                    this.M9(s1);
                    goto label_10;
                }
            }
            return;
        }
    label_10:
        b0 b00 = this.x;
        V1 v10 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.l0, "postWriteMiniSetting");
        b00.l0.setVisibility((postHead0 != null && postHead0.i() == 999 && postHead0.l() == 9 ? 8 : 0));
        if(postHead0 != null) {
            v = postHead0.i();
        }
        GalleryInfo galleryInfo0 = this.z;
        if(galleryInfo0 == null) {
            s2 = null;
        }
        else {
            List list0 = galleryInfo0.v();
            if(list0 == null) {
                s2 = null;
            }
            else {
                Object object0 = null;
                for(Object object1: list0) {
                    if(((PostHeadPlaceHolder)object1).f() == v) {
                        object0 = object1;
                        break;
                    }
                }
                s2 = ((PostHeadPlaceHolder)object0) == null ? null : ((PostHeadPlaceHolder)object0).g();
            }
        }
        if(this.L.B(s2)) {
            View view0 = this.getCurrentFocus();
            if(view0 != null && view0.getId() == 0x7F0B0BBC) {  // id:post_write_item_text
                view0.clearFocus();
            }
            this.L.u0(s2);
        }
        V1 v11 = this.M9;
        if(v11 == null) {
            L.S("postWriteGuideManager");
        }
        else {
            v10 = v11;
        }
        v10.g();
    }

    // 检测为 Lambda 实现
    private static final void H9(PostWriteActivity postWriteActivity0, String s, String s1, View view0) [...]

    private final void I5() {
        o o0 = this.Q8;
        if(o0 != null) {
            o0.l();
        }
    }

    @l
    public final com.dcinside.rich.c I6() {
        return this.j9;
    }

    private final void I7() {
        PostAutoDeleteActivity.w.a(this, this.n9);
    }

    private final void I8() {
        boolean z = true;
        int v = 0;
        if(this.n9 == null && (this.o9 == null && !this.q9) && !this.p9) {
            z = false;
        }
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        View view0 = b00.m0;
        if(!z) {
            v = 8;
        }
        view0.setVisibility(v);
    }

    private final void I9(String s) {
        static final class l1 extends N implements Function1 {
            final String e;

            l1(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(new l1(s)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
    }

    @Override  // com.dcinside.app.write.menu.ai.w0
    public void J(@l View view0, int v) {
        static final class R0 extends N implements Function1 {
            public static final R0 e;

            static {
                R0.e = new R0();
            }

            R0() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1505CE);  // string:make_ai_load_confirm "작성 중인 프롬프트는 삭제됩니다.\n프롬프트를 불러오시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.PostWriteActivity.S0 extends N implements Function1 {
            public static final com.dcinside.app.write.PostWriteActivity.S0 e;

            static {
                com.dcinside.app.write.PostWriteActivity.S0.e = new com.dcinside.app.write.PostWriteActivity.S0();
            }

            com.dcinside.app.write.PostWriteActivity.S0() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class T0 extends N implements Function1 {
            final PostWriteActivity e;
            final com.dcinside.app.realm.b f;

            T0(PostWriteActivity postWriteActivity0, com.dcinside.app.realm.b b0) {
                this.e = postWriteActivity0;
                this.f = b0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                AiPromptLoadItem aiPromptLoadItem0 = new AiPromptLoadItem(0L, 0L, null, "", "");
                this.e.L8(aiPromptLoadItem0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        com.dcinside.app.realm.b b0 = this.L6().x(v);
        switch(view0.getId()) {
            case 0x7F0B00D2: {  // id:ai_image_recent_delete_wrap
                break;
            }
            case 0x7F0B00D7:   // id:ai_image_recent_prompt_all
            case 0x7F0B00DB: {  // id:ai_image_recent_read_only_prompt_all
                this.F9(b0);
                break;
            }
            default: {
                if(!b0.s()) {
                    return;
                }
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                Editable editable0 = b00.n.getText();
                if(editable0 != null && editable0.length() > 0) {
                    com.dcinside.app.perform.e.e.a(this).n(R0.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                        L.p(com.dcinside.app.write.PostWriteActivity.S0.e, "$tmp0");
                        return (Boolean)com.dcinside.app.write.PostWriteActivity.S0.e.invoke(object0);
                    }).x5((Object object0) -> {
                        L.p(new T0(this, b0), "$tmp0");
                        new T0(this, b0).invoke(object0);
                    });
                    return;
                }
                this.L8(new AiPromptLoadItem(0L, 0L, null, "", ""));
            }
        }
    }

    private final void J5(boolean z) {
        b0 b00 = null;
        if(z) {
            View view0 = this.getCurrentFocus();
            if(view0 instanceof RichEditText) {
                b0 b01 = this.x;
                if(b01 == null) {
                    L.S("binding");
                    b01 = null;
                }
                b01.A0.setEditText(((RichEditText)view0));
                b0 b02 = this.x;
                if(b02 == null) {
                    L.S("binding");
                    b02 = null;
                }
                b02.A0.setVisibility(0);
                b0 b03 = this.x;
                if(b03 == null) {
                    L.S("binding");
                    b03 = null;
                }
                b03.b0.setVisibility(4);
                b0 b04 = this.x;
                if(b04 == null) {
                    L.S("binding");
                    b04 = null;
                }
                b04.j0.setVisibility(8);
                b0 b05 = this.x;
                if(b05 == null) {
                    L.S("binding");
                    b05 = null;
                }
                b05.h0.setVisibility(8);
                b0 b06 = this.x;
                if(b06 == null) {
                    L.S("binding");
                }
                else {
                    b00 = b06;
                }
                b00.i0.setVisibility(8);
            }
        }
        else {
            b0 b07 = this.x;
            if(b07 == null) {
                L.S("binding");
                b07 = null;
            }
            b07.A0.setEditText(null);
            b0 b08 = this.x;
            if(b08 == null) {
                L.S("binding");
                b08 = null;
            }
            ColorPickerView colorPickerView0 = b08.A0.getColorPalette();
            if(colorPickerView0 != null) {
                colorPickerView0.setVisibility(8);
            }
            b0 b09 = this.x;
            if(b09 == null) {
                L.S("binding");
                b09 = null;
            }
            b09.A0.setVisibility(4);
            b0 b010 = this.x;
            if(b010 == null) {
                L.S("binding");
            }
            else {
                b00 = b010;
            }
            b00.b0.setVisibility(0);
        }
    }

    private final com.dcinside.app.write.menu.ai.model.a J6() {
        return (com.dcinside.app.write.menu.ai.model.a)this.N9.getValue();
    }

    private final void J7() {
        this.P.z(com.dcinside.app.write.h1.a.a);
    }

    private final void J8(g1 g10) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onPostTempChanged$2", f = "PostWriteActivity.kt", i = {}, l = {0x853, 0x85B}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostWriteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$onPostTempChanged$2\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4099:1\n112#2,3:4100\n129#2,15:4104\n116#2:4119\n129#2,15:4120\n1#3:4103\n*S KotlinDebug\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$onPostTempChanged$2\n*L\n2134#1:4100,3\n2134#1:4104,15\n2134#1:4119\n2134#1:4120,15\n2134#1:4103\n*E\n"})
        static final class Z0 extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final PostWriteActivity l;
            final int m;

            Z0(PostWriteActivity postWriteActivity0, int v, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                this.m = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new Z0(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((Z0)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onPostTempChanged$2$1", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.write.PostWriteActivity.Z0.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final PostWriteActivity l;

                    com.dcinside.app.write.PostWriteActivity.Z0.a(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                        this.l = postWriteActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.write.PostWriteActivity.Z0.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.write.PostWriteActivity.Z0.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        PostWriteActivity.t9(this.l, true, false, "임시 저장 목록을 최적화중입니다.", 2, null);
                        return S0.a;
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onPostTempChanged$2$3", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.write.PostWriteActivity.Z0.b extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final PostWriteActivity l;

                    com.dcinside.app.write.PostWriteActivity.Z0.b(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                        this.l = postWriteActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.write.PostWriteActivity.Z0.b(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.write.PostWriteActivity.Z0.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        PostWriteActivity.t9(this.l, false, false, null, 6, null);
                        return S0.a;
                    }
                }

                Class class0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        com.dcinside.app.write.PostWriteActivity.Z0.a postWriteActivity$Z0$a0 = new com.dcinside.app.write.PostWriteActivity.Z0.a(this.l, null);
                        this.k = 1;
                        if(i.h(h0.e(), postWriteActivity$Z0$a0, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                int v = this.m;
                F0 f00 = F0.g4();
                L.m(f00);
                boolean z = f00.E0();
                class0 = j0.class;
                if(z) {
                    g1 g10 = f00.C4(class0).g2("time", r1.b).p0();
                    g1 g11 = g10.x4().F1(((long)(g10.size() - v))).p0();
                    L.o(g11, "findAll(...)");
                    j0.h.b(f00, g11);
                }
                else {
                    f00.beginTransaction();
                    goto label_23;
                }
                goto label_38;
                try {
                label_23:
                    g1 g12 = f00.C4(class0).g2("time", r1.b).p0();
                    g1 g13 = g12.x4().F1(((long)(g12.size() - v))).p0();
                    L.o(g13, "findAll(...)");
                    j0.h.b(f00, g13);
                    f00.p();
                    goto label_38;
                }
                catch(Throwable throwable1) {
                    try {
                        if(f00.E0()) {
                            f00.e();
                        }
                        throw throwable1;
                    }
                    catch(Throwable throwable0) {
                    }
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable2) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable2;
                }
            label_38:
                kotlin.io.c.a(f00, null);
                com.dcinside.app.write.PostWriteActivity.Z0.b postWriteActivity$Z0$b0 = new com.dcinside.app.write.PostWriteActivity.Z0.b(this.l, null);
                this.k = 2;
                return i.h(h0.e(), postWriteActivity$Z0$b0, this) == object1 ? object1 : S0.a;
            }
        }

        if(this.s1()) {
            return;
        }
        int v = jl.a.L0();
        int v1 = g10 == null ? 0 : g10.size();
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.z0.setVisibility((v1 <= 0 ? 8 : 0));
        L.o("저장 %d", "getString(...)");
        String s = String.format("저장 %d", Arrays.copyOf(new Object[]{Math.min(v1, v)}, 1));
        L.o(s, "format(...)");
        b00.z0.setText(s);
        if(v1 > v && !this.m7()) {
            kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new Z0(this, v, null), 2, null);
        }
    }

    private final void J9(AiImageStatusResult aiImageStatusResult0) {
        this.P9(aiImageStatusResult0);
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.z, "postWriteAiEasyWrap");
        b00.z.setVisibility(0);
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
            b02 = null;
        }
        ConstraintLayout constraintLayout0 = b02.z;
        L.o(constraintLayout0, "postWriteAiEasyWrap");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = constraintLayout0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)viewGroup$LayoutParams0).height = -2;
        constraintLayout0.setLayoutParams(((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)viewGroup$LayoutParams0));
        com.dcinside.app.util.Nk.a nk$a0 = Nk.a;
        b0 b03 = this.x;
        if(b03 == null) {
            L.S("binding");
        }
        else {
            b01 = b03;
        }
        nk$a0.f(b01.n);
    }

    @Override  // com.dcinside.app.write.B1
    protected void K1() {
        if(this.s1()) {
            return;
        }
        View view0 = this.getCurrentFocus();
        if(view0 instanceof RichEditText && ((RichEditText)view0).isFocused()) {
            b0 b00 = this.x;
            if(b00 == null) {
                L.S("binding");
                b00 = null;
            }
            b00.A0.setEditText(((RichEditText)view0));
            return;
        }
        this.J5(false);
    }

    private final void K5(View view0) {
    }

    private final String K6() {
        B b0 = B.E.V(this.F1());
        if(b0 == null) {
            b0 b00 = this.x;
            if(b00 == null) {
                L.S("binding");
                b00 = null;
            }
            return String.valueOf(b00.n0.getText());
        }
        String s = b0.m6();
        return s == null ? "" : s;
    }

    private final void K7() {
        static final class z0 extends N implements Function1 {
            public static final z0 e;

            static {
                z0.e = new z0();
            }

            z0() {
                super(1);
            }

            public final Boolean a(k0 k00) {
                return Boolean.valueOf(k0.r.M(k00));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((k0)object0));
            }
        }

        Integer integer0 = (Integer)rx.g.y2(this.L.S()).Z1((Object object0) -> {
            L.p(z0.e, "$tmp0");
            return (Boolean)z0.e.invoke(object0);
        }).l1().x6().r(0);
        L.m(integer0);
        if(((int)integer0) >= 5) {
            Dl.D(this, 0x7F150817);  // string:post_write_voice_max_alert "보이스 등록은 최대 5개까지만 가능합니다."
            return;
        }
        this.P.z(com.dcinside.app.write.h1.a.b);
    }

    private final void K8() {
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        Editable editable0 = b00.n.getText();
        String s = editable0 == null ? null : editable0.toString();
        int v = s == null || s.length() == 0 ? 1 : 0;
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
        }
        else {
            b01 = b02;
        }
        b01.m.setActivated(((boolean)(v ^ 1)));
    }

    private final void K9() {
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.V, "postWriteDeleteDefNick");
        b00.V.setVisibility(0);
    }

    public static final void L3(PostWriteActivity postWriteActivity0, View view0) {
    }

    private final void L5() {
        if(!dl.a.W()) {
            int v = this.L.getItemCount();
            this.L.notifyItemChanged(v - 1);
            b0 b00 = this.x;
            if(b00 == null) {
                L.S("binding");
                b00 = null;
            }
            L.o(b00.z, "postWriteAiEasyWrap");
            b00.z.setVisibility(8);
        }
    }

    private final v0 L6() {
        return (v0)this.O9.getValue();
    }

    // 检测为 Lambda 实现
    private static final Boolean L7(Function1 function10, Object object0) [...]

    private final void L8(AiPromptLoadItem aiPromptLoadItem0) {
        String s = aiPromptLoadItem0.o();
        if(s == null) {
            s = "";
        }
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.n.setText(s);
        this.Q6();
    }

    private final void L9(String s) {
        g g1;
        g g0 = this.R8;
        if(g0 != null) {
            g0.dismissAllowingStateLoss();
        }
        if(this.isDestroyed() || this.isFinishing() || this.getSupportFragmentManager().d1()) {
            return;
        }
        try {
            V[] arr_v = {r0.a("vpnBanMessage", s), r0.a("vpnBanGalleryId", this.D6())};
            FragmentManager fragmentManager0 = this.getSupportFragmentManager();
            L.o(fragmentManager0, "getSupportFragmentManager(...)");
            FragmentFactory fragmentFactory0 = fragmentManager0.G0();
            ClassLoader classLoader0 = g.class.getClassLoader();
            L.m(classLoader0);
            Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.post.fragments.g");
            if(fragment0 == null) {
                g1 = null;
            }
            else {
                g1 = (g)fragment0;
                g1.setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 2))));
                g1.show(fragmentManager0, "com.dcinside.app.post.fragments.g");
            }
        }
        catch(Exception unused_ex) {
            g1 = null;
            this.R8 = g1;
            return;
        }
        this.R8 = g1;
    }

    private final void M5() {
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.z, "postWriteAiEasyWrap");
        if(b00.z.getVisibility() == 0) {
            com.dcinside.app.util.Nk.a nk$a0 = Nk.a;
            b0 b02 = this.x;
            if(b02 == null) {
                L.S("binding");
            }
            else {
                b01 = b02;
            }
            nk$a0.f(b01.n);
        }
    }

    private final int M6() {
        View view0 = this.getCurrentFocus();
        y2 y20 = null;
        RichEditText richEditText0 = view0 instanceof RichEditText ? ((RichEditText)view0) : null;
        if(richEditText0 == null) {
            return -1;
        }
        ViewParent viewParent0 = richEditText0.getParent();
        ConstraintLayout constraintLayout0 = viewParent0 instanceof ConstraintLayout ? ((ConstraintLayout)viewParent0) : null;
        if(constraintLayout0 == null) {
            return -1;
        }
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        ViewHolder recyclerView$ViewHolder0 = b00.w0.getChildViewHolder(constraintLayout0);
        if(recyclerView$ViewHolder0 instanceof y2) {
            y20 = (y2)recyclerView$ViewHolder0;
        }
        return y20 == null ? -1 : y20.getBindingAdapterPosition();
    }

    private final void M7() {
        static final class A0 extends N implements Function1 {
            public static final A0 e;

            static {
                A0.e = new A0();
            }

            A0() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.J(0x7F150BDA).m(0x7F150BCD);  // string:youtube_title "YouTube 변환"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class B0 extends N implements Function1 {
            public static final B0 e;

            static {
                B0.e = new B0();
            }

            B0() {
                super(1);
            }

            public final Boolean a(Integer integer0) {
                return integer0 != null && -3 == ((int)integer0) ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class C0 extends N implements Function1 {
            final PostWriteActivity e;
            final PostHead f;
            final List g;
            final List h;
            final SparseArray i;
            final String j;
            final List k;
            final List l;

            C0(PostWriteActivity postWriteActivity0, PostHead postHead0, List list0, List list1, SparseArray sparseArray0, String s, List list2, List list3) {
                this.e = postWriteActivity0;
                this.f = postHead0;
                this.g = list0;
                this.h = list1;
                this.i = sparseArray0;
                this.j = s;
                this.k = list2;
                this.l = list3;
                super(1);
            }

            public final rx.g a(Integer integer0) {
                L.m(integer0);
                return this.e.x7(((int)integer0), this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        @s0({"SMAP\nPostWriteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$onClickedConfirmWrite$6\n+ 2 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n*L\n1#1,4099:1\n9#2:4100\n*S KotlinDebug\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$onClickedConfirmWrite$6\n*L\n3103#1:4100\n*E\n"})
        static final class D0 extends N implements Function1 {
            final PostWriteActivity e;
            final String f;
            final PostHead g;

            D0(PostWriteActivity postWriteActivity0, String s, PostHead postHead0) {
                this.e = postWriteActivity0;
                this.f = s;
                this.g = postHead0;
                super(1);
            }

            public final void a(com.dcinside.app.model.f0 f00) {
                int v;
                this.e.X8();
                PostWriteActivity postWriteActivity0 = this.e;
                Intent intent0 = new Intent().putExtra("com.dcinside.app.extra.GALLERY_ID", this.f);
                String s = f00.a();
                boolean z = false;
                if(s == null) {
                    v = 0;
                }
                else {
                    Integer integer0 = kotlin.text.v.b1(s);
                    v = integer0 == null ? 0 : ((int)integer0);
                }
                Intent intent1 = intent0.putExtra("com.dcinside.app.extra.POST_NUMBER", v);
                if(this.g != null && this.g.i() == 999 && this.g.l() == 9) {
                    z = true;
                }
                postWriteActivity0.setResult(-1, intent1.putExtra("com.dcinside.app.extra.EXTRA_IS_MANAGER_HEAD", z));
                this.e.finish();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.f0)object0));
                return S0.a;
            }
        }

        PostHead postHead1;
        if(!this.m7() && kl.a(new o[]{this.Z})) {
            if(!this.p7()) {
                Dl.D(this, 0x7F150681);  // string:modify_post_image_loading "첨부 이미지 로딩 중입니다. 잠시 후 다시 시도해주세요."
                return;
            }
            b0 b00 = this.x;
            e e0 = null;
            if(b00 == null) {
                L.S("binding");
                b00 = null;
            }
            Adapter recyclerView$Adapter0 = b00.Y.getAdapter();
            com.dcinside.app.head.a a0 = recyclerView$Adapter0 instanceof com.dcinside.app.head.a ? ((com.dcinside.app.head.a)recyclerView$Adapter0) : null;
            if(a0 == null) {
                postHead1 = null;
            }
            else {
                if(!a0.A()) {
                    a0 = null;
                }
                if(a0 == null) {
                    postHead1 = null;
                }
                else {
                    PostHead postHead0 = a0.z();
                    if(postHead0 == null) {
                        com.dcinside.app.internal.c.v(this, 0x7F150BAF);  // string:write_head_unknown "말머리를 선택해주세요."
                        return;
                    }
                    postHead1 = postHead0;
                }
            }
            m0.a.a a$a0 = m0.a.a;
            b0 b01 = this.x;
            if(b01 == null) {
                L.S("binding");
                b01 = null;
            }
            if(a$a0.i(String.valueOf(b01.y0.getText()))) {
                com.dcinside.app.internal.c.v(this, 0x7F15080C);  // string:post_write_subject_confirm "제목을 입력해 주세요."
                return;
            }
            if(((long)this.L.O()) > this.F6()) {
                String s = this.getString(0x7F1507FE, new Object[]{this.F6()});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
                L.o(s, "getString(...)");
                com.dcinside.app.internal.c.w(this, s);
                return;
            }
            b0 b02 = this.x;
            if(b02 == null) {
                L.S("binding");
                b02 = null;
            }
            L.o(b02.W, "postWriteGuest");
            if(b02.W.getVisibility() == 0) {
                b0 b03 = this.x;
                if(b03 == null) {
                    L.S("binding");
                    b03 = null;
                }
                String s1 = kotlin.text.v.G5(String.valueOf(b03.n0.getText())).toString();
                if(this.Z9()) {
                    b0 b04 = this.x;
                    if(b04 == null) {
                        L.S("binding");
                        b04 = null;
                    }
                    s1 = kotlin.text.v.G5(b04.R.getText().toString()).toString();
                }
                if(a$a0.i(s1)) {
                    com.dcinside.app.internal.c.v(this, 0x7F150802);  // string:post_write_nick_confirm "닉네임을 입력해 주세요."
                    return;
                }
                if(s1.length() < 2) {
                    String s2 = this.getString(0x7F150803, new Object[]{2});  // string:post_write_nick_more "닉네임은 최소 %1$d자 이상 입력해 주세요."
                    L.o(s2, "getString(...)");
                    com.dcinside.app.internal.c.w(this, s2);
                    return;
                }
                b0 b05 = this.x;
                if(b05 == null) {
                    L.S("binding");
                    b05 = null;
                }
                String s3 = String.valueOf(b05.o0.getText());
                if(a$a0.i(s3)) {
                    com.dcinside.app.internal.c.v(this, 0x7F150807);  // string:post_write_pw_confirm "비밀번호를 입력해 주세요."
                    return;
                }
                if(s3.length() < 4) {
                    String s4 = this.getString(0x7F150808, new Object[]{4});  // string:post_write_pw_more "비밀번호는 최소 %1$d자리 이상 입력해 주세요.\n\n쉬운 비밀번호는 타인이 수정 또는 삭제하기 
                                                                              // 쉬우니 어려운 비밀번호를 입력해 주세요."
                    L.o(s4, "getString(...)");
                    com.dcinside.app.internal.c.w(this, s4);
                    return;
                }
                e e1 = this.Q;
                if(e1 != null && !this.q7()) {
                    e0 = e1;
                }
                if(e0 != null && e0.l() && !e0.h()) {
                    com.dcinside.app.internal.c.v(this, 0x7F15078D);  // string:please_code_input "코드를 입력해 주세요."
                    return;
                }
            }
            int v = -1;
            for(Object object0: this.L.S()) {
                k0 k00 = (k0)object0;
                com.dcinside.app.realm.k0.a k0$a0 = k0.r;
                if(k0$a0.D(k00) && !k0$a0.C(k00)) {
                    String[] arr_s = k0$a0.P(k00.b6());
                    if(arr_s.length != 0) {
                        v = kotlin.ranges.s.u(v, Integer.parseInt(((String[])kotlin.text.v.V4(arr_s[0], new String[]{"_"}, false, 0, 6, null).toArray(new String[0]))[3]));
                    }
                }
            }
            String s5 = this.D6();
            com.dcinside.app.write.g g0 = O2.d(s5, this.L.S(), v + 1);
            List list0 = g0.a();
            List list1 = g0.b();
            SparseArray sparseArray0 = g0.c();
            boolean z = g0.d();
            int v1 = g0.e();
            String s6 = g0.g();
            List list2 = g0.h();
            List list3 = g0.i();
            if(g0.f() == 0) {
                com.dcinside.app.internal.c.v(this, 0x7F1507F6);  // string:post_write_content_confirm "내용을 입력해 주세요."
                return;
            }
            if(v1 > 50000) {
                com.dcinside.app.internal.c.v(this, 0x7F1507FF);  // string:post_write_length_confirm "글자 수는 50,000자 이하여야 합니다."
                return;
            }
            this.r6();
            this.Z = rx.g.v1(new K(z, this)).Z1((Object object0) -> {
                L.p(B0.e, "$tmp0");
                return (Boolean)B0.e.invoke(object0);
            }).f2((Object object0) -> {
                L.p(new C0(this, postHead1, list1, list0, sparseArray0, s6, list2, list3), "$tmp0");
                return (rx.g)new C0(this, postHead1, list1, list0, sparseArray0, s6, list2, list3).invoke(object0);
            }).R1(() -> {
                L.p(this, "this$0");
                if(this.q1()) {
                    PostWriteActivity.t9(this, true, false, null, 6, null);
                }
            }).T1(() -> {
                L.p(this, "this$0");
                if(this.q1()) {
                    PostWriteActivity.t9(this, false, false, null, 6, null);
                }
            }).y5((Object object0) -> {
                L.p(new D0(this, s5, postHead1), "$tmp0");
                new D0(this, s5, postHead1).invoke(object0);
            }, (Throwable throwable0) -> {
                String s;
                L.p(this, "this$0");
                if(throwable0 instanceof com.dcinside.app.http.q) {
                    this.L9(throwable0.getMessage());
                    return;
                }
                if(throwable0 instanceof com.dcinside.app.http.b) {
                    for(Object object0: jl.a.B()) {
                        List list0 = ((com.dcinside.app.model.e)object0).g();
                        if(list0 != null && u.W1(list0, this.D6())) {
                            goto label_14;
                        }
                        List list1 = ((com.dcinside.app.model.e)object0).g();
                        if(list1 == null || !list1.contains("*")) {
                            continue;
                        }
                        goto label_14;
                    }
                    object0 = null;
                label_14:
                    com.dcinside.app.type.e.a e$a0 = com.dcinside.app.type.e.a;
                    if(((com.dcinside.app.model.e)object0) == null) {
                        s = "";
                    }
                    else {
                        s = ((com.dcinside.app.model.e)object0).h();
                        if(s == null) {
                            s = "";
                        }
                    }
                    e$a0.h(this, s);
                    return;
                }
                timber.log.b.a.y(throwable0);
                com.dcinside.app.perform.e e0 = com.dcinside.app.perform.e.e.a(this);
                L.m(throwable0);
                e0.q(throwable0);
            });
        }
    }

    private final void M8(String s) {
        String s1;
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        EditText editText0 = b00.n;
        L.o(editText0, "postWriteAiEasyPromptInput");
        Editable editable0 = editText0.getText();
        if(editable0 == null) {
            s1 = "";
        }
        else {
            s1 = editable0.toString();
            if(s1 == null) {
                s1 = "";
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(s1.length() > 0) {
            if(kotlin.text.v.N1(s1, ",", false, 2, null)) {
                stringBuilder0.append(" \n");
            }
            else if(kotlin.text.v.N1(s1, ", ", false, 2, null)) {
                stringBuilder0.append("\n");
            }
            else {
                stringBuilder0.append(", \n");
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", ");
        editText0.append(stringBuilder0.toString());
        editText0.post(() -> {
            L.p(this, "this$0");
            com.dcinside.app.util.Nk.a nk$a0 = Nk.a;
            b0 b00 = this.x;
            if(b00 == null) {
                L.S("binding");
                b00 = null;
            }
            nk$a0.f(b00.n);
        });
    }

    private final void M9(String s) {
        public static final class n1 extends AnimatorListenerAdapter {
            final TextView a;

            n1(TextView textView0) {
                this.a = textView0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(@l Animator animator0) {
                public static final class com.dcinside.app.write.PostWriteActivity.n1.a extends AnimatorListenerAdapter {
                    final TextView a;

                    com.dcinside.app.write.PostWriteActivity.n1.a(TextView textView0) {
                        this.a = textView0;
                        super();
                    }

                    @Override  // android.animation.AnimatorListenerAdapter
                    public void onAnimationEnd(@l Animator animator0) {
                        L.p(animator0, "animation");
                        this.a.setVisibility(8);
                    }
                }

                L.p(animator0, "animation");
                this.a.animate().setStartDelay(2000L).setListener(new com.dcinside.app.write.PostWriteActivity.n1.a(this.a)).alpha(0.0f).setDuration(800L);
            }
        }

        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        TextView textView0 = b00.Z;
        L.o(textView0, "postWriteIgnoreHeadToast");
        ViewPropertyAnimator viewPropertyAnimator0 = textView0.animate();
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
        }
        textView0.setText(s);
        textView0.setAlpha(0.0f);
        textView0.setVisibility(0);
        textView0.animate().setStartDelay(0L).alpha(1.0f).setDuration(800L).setListener(new n1(textView0));
    }

    private final void N5(f f0, int v) {
        static final class n extends N implements Function1 {
            final f e;
            final PostWriteActivity f;
            final int g;

            n(f f0, PostWriteActivity postWriteActivity0, int v) {
                this.e = f0;
                this.f = postWriteActivity0;
                this.g = v;
                super(1);
            }

            public final void a(com.dcinside.app.model.k k0) {
                if(L.g(k0.h(), Boolean.TRUE)) {
                    this.e.o(k0.g());
                    PostWriteActivity.d9(this.f, this.e, this.g, false, 4, null);
                    return;
                }
                this.f.y8();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.k)object0));
                return S0.a;
            }
        }

        String s = f0.e();
        if(s != null && s.length() != 0) {
            if(!new File(s).canRead()) {
                this.y8();
                return;
            }
            this.w9 = uk.xG(s, this.D6()).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
                L.p(new n(f0, this, v), "$tmp0");
                new n(f0, this, v).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                this.y8();
            });
            return;
        }
        this.y8();
    }

    @l
    public final RichToolbar N6() {
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.A0, "postWriteTextBar");
        return b00.A0;
    }

    private static final rx.g N7(boolean z, PostWriteActivity postWriteActivity0) {
        L.p(postWriteActivity0, "this$0");
        return z ? com.dcinside.app.perform.e.e.a(postWriteActivity0).n(A0.e).z(0x7F150BCE).x(0x7F150BCC).e(-3).d() : rx.g.Q2(-2);  // string:youtube_ok "변환"
    }

    // 检测为 Lambda 实现
    private static final void N8(PostWriteActivity postWriteActivity0) [...]

    private final void N9() {
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.n0.setEnabled(true);
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
            b02 = null;
        }
        L.o(b02.S, "postWriteDefGuestWrap");
        b02.S.setVisibility(8);
        b0 b03 = this.x;
        if(b03 == null) {
            L.S("binding");
        }
        else {
            b01 = b03;
        }
        L.o(b01.D0, "postWriteUseDefNick");
        b01.D0.setVisibility(0);
    }

    // 检测为 Lambda 实现
    private static final void O5(Function1 function10, Object object0) [...]

    public final int O6() {
        return this.k9;
    }

    // 检测为 Lambda 实现
    private static final Boolean O7(Function1 function10, Object object0) [...]

    private final void O8() {
        this.J5(false);
    }

    private final void O9() {
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        if(b00.z.getHeight() > this.L9 / 2) {
            b0 b02 = this.x;
            if(b02 == null) {
                L.S("binding");
                b02 = null;
            }
            L.o(b02.z, "postWriteAiEasyWrap");
            b02.z.setVisibility(0);
            b0 b03 = this.x;
            if(b03 == null) {
                L.S("binding");
            }
            else {
                b01 = b03;
            }
            ConstraintLayout constraintLayout0 = b01.z;
            L.o(constraintLayout0, "postWriteAiEasyWrap");
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = constraintLayout0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            }
            ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)viewGroup$LayoutParams0).height = -2;
            constraintLayout0.setLayoutParams(((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)viewGroup$LayoutParams0));
            return;
        }
        this.n6();
    }

    // 检测为 Lambda 实现
    private static final void P5(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    @l
    public final rx.subscriptions.b P6() {
        return this.S8;
    }

    // 检测为 Lambda 实现
    private static final rx.g P7(Function1 function10, Object object0) [...]

    private final boolean P8(MotionEvent motionEvent0) {
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                this.L9 = b00.z.getHeight();
                this.K9 = motionEvent0.getRawY();
                return false;
            }
            case 2: {
                float f = this.K9;
                float f1 = motionEvent0.getRawY();
                this.K9 = motionEvent0.getRawY();
                this.w7(f - f1);
                return false;
            }
            case 1: 
            case 3: {
                this.O9();
                return false;
            }
            default: {
                return false;
            }
        }
    }

    private final void P9(AiImageStatusResult aiImageStatusResult0) {
        List list0 = aiImageStatusResult0.r();
        Integer integer0 = dl.a.x();
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        AiModelItem aiModelItem0 = (AiModelItem)list0.get((integer0 == null ? kotlin.random.f.a.m(list0.size()) : ((int)integer0)));
        if(this.J9 == null) {
            this.J9 = aiModelItem0;
        }
        int v = aiImageStatusResult0.y();
        String s = this.getString(0x7F1507F3, new Object[]{((int)(v - aiImageStatusResult0.u())), v});  // string:post_write_ai_easy_prompt_hint "AI 이미지에 반영할 단어 입력 (영문, 쉼표로 구분)\n생성 횟수 : %1$d/%2$d"
        L.o(s, "getString(...)");
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.n.setHint(s);
        AiModelItem aiModelItem1 = this.J9;
        if(aiModelItem1 != null) {
            com.dcinside.app.write.menu.ai.type.a a0 = aiModelItem1.c();
            if(a0 != null) {
                int v1 = a0.d();
                b0 b01 = this.x;
                if(b01 == null) {
                    L.S("binding");
                    b01 = null;
                }
                String s1 = this.getString(v1);
                b01.h.setText(s1);
                this.I9 = aiImageStatusResult0;
                this.J6().A(list0);
                AiModelItem aiModelItem2 = this.J9;
                if(aiModelItem2 != null) {
                    this.J6().y(aiModelItem2);
                }
                F0 f00 = this.F1();
                if(f00 != null) {
                    if(this.P9 != null && this.P9.s()) {
                        g1 g10 = this.P9;
                        if(g10 != null) {
                            g10.D();
                        }
                        this.P9 = null;
                    }
                    g1 g11 = f00.C4(com.dcinside.app.realm.b.class).g2("time", r1.c).p0();
                    this.P9 = g11;
                    if(g11 != null) {
                        g11.l(this.Q9);
                    }
                }
            }
        }
    }

    private final void Q5() {
        static final class com.dcinside.app.write.PostWriteActivity.o extends N implements Function1 {
            final PostWriteActivity e;

            com.dcinside.app.write.PostWriteActivity.o(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(com.dcinside.app.response.i i0) {
                GalleryInfo galleryInfo0 = i0.c();
                this.e.z = galleryInfo0;
                this.e.Q9();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.response.i)object0));
                return S0.a;
            }
        }

        if(this.getIntent().hasExtra("com.dcinside.app.extra.MODIFY")) {
            return;
        }
        String s = this.D6();
        if(s == null) {
            return;
        }
        this.E9 = uk.kG(s, null, 0, null, null, null, null, null, null, null, null).M3(rx.android.schedulers.a.c()).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                PostWriteActivity.t9(this, true, false, null, 6, null);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                PostWriteActivity.t9(this, false, false, null, 6, null);
            }
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.PostWriteActivity.o(this), "$tmp0");
            new com.dcinside.app.write.PostWriteActivity.o(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.Q9();
        });
    }

    private final void Q6() {
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.r, "postWriteAiEasySelect");
        b00.r.setVisibility(8);
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
            b02 = null;
        }
        b02.u.setAdapter(null);
        b0 b03 = this.x;
        if(b03 == null) {
            L.S("binding");
            b03 = null;
        }
        b03.u.setLayoutManager(null);
        b0 b04 = this.x;
        if(b04 == null) {
            L.S("binding");
            b04 = null;
        }
        L.o(b04.t, "postWriteAiEasySelectModeIndicator");
        b04.t.setVisibility(8);
        b0 b05 = this.x;
        if(b05 == null) {
            L.S("binding");
        }
        else {
            b01 = b05;
        }
        L.o(b01.q, "postWriteAiEasyRecentEmpty");
        b01.q.setVisibility(8);
    }

    // 检测为 Lambda 实现
    private static final void Q7(PostWriteActivity postWriteActivity0) [...]

    // 检测为 Lambda 实现
    private static final Boolean Q8(Function1 function10, Object object0) [...]

    private final void Q9() {
        Intent intent0 = this.getIntent();
        L.o(intent0, "getIntent(...)");
        this.C9(intent0);
        DcConPickerView dcConPickerView0 = this.P.k();
        if(dcConPickerView0 != null) {
            dcConPickerView0.l0();
        }
        this.b9();
        if(this.getIntent().hasExtra("com.dcinside.app.extra.MODIFY")) {
            PostModify postModify0 = this.A;
            if(postModify0 != null) {
                this.t7(postModify0);
            }
        }
        else {
            GalleryInfo galleryInfo0 = this.z;
            if(galleryInfo0 != null) {
                this.D9(galleryInfo0);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void R5(PostWriteActivity postWriteActivity0) [...]

    private final void R6(com.dcinside.app.model.p p0) {
        c4 c40 = this.U9;
        b0 b00 = null;
        if(c40 == null) {
            b0 b01 = this.x;
            if(b01 == null) {
                L.S("binding");
                b01 = null;
            }
            u0 u00 = (ViewStub viewStub0, View view0) -> {
                L.p(this, "this$0");
                L.p(p0, "$icon");
                c4 c40 = c4.a(view0);
                L.o(c40, "bind(...)");
                this.U9 = c40;
                this.v9(p0);
            };
            b01.P.setOnInflateListener(u00);
            b0 b02 = this.x;
            if(b02 == null) {
                L.S("binding");
            }
            else {
                b00 = b02;
            }
            b00.P.inflate();
        }
        else {
            if(c40 == null) {
                L.S("dcconDetailBinding");
                c40 = null;
            }
            ConstraintLayout constraintLayout0 = c40.b();
            L.o(constraintLayout0, "getRoot(...)");
            constraintLayout0.setVisibility(0);
            this.v9(p0);
        }
        this.j7(false);
    }

    // 检测为 Lambda 实现
    private static final void R7(PostWriteActivity postWriteActivity0) [...]

    // 检测为 Lambda 实现
    private static final void R8(Function1 function10, Object object0) [...]

    private final void R9() {
        com.dcinside.app.util.Nk.a nk$a0 = Nk.a;
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        nk$a0.c(b00.n);
        if(cl.i(this, this)) {
            this.D = 0x77;
            return;
        }
        Intent intent0 = new Intent(this, AlbumActivity.class);
        intent0.setAction("ACTION_EXECUTE_PROMPT_IMAGE");
        U.a.b = 1;
        ActivityResultLauncher activityResultLauncher0 = this.F9;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.b(intent0);
        }
    }

    // 检测为 Lambda 实现
    private static final void S5(PostWriteActivity postWriteActivity0) [...]

    // 检测为 Lambda 实现
    private static final void S6(PostWriteActivity postWriteActivity0, com.dcinside.app.model.p p0, ViewStub viewStub0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void S7(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void S8(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    private final void S9(Collection collection0) {
        static final class o1 extends N implements Function1 {
            final PostWriteActivity e;

            o1(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(VideoUploadResult videoUploadResult0) {
                String s = videoUploadResult0.c();
                if(s != null && s.length() != 0) {
                    com.dcinside.app.internal.c.w(this.e, videoUploadResult0.c());
                    return;
                }
                String s1 = this.e.D6();
                VideoSettingActivity.B.a(this.e, videoUploadResult0, null, s1, this.e.y9);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((VideoUploadResult)object0));
                return S0.a;
            }
        }

        com.dcinside.app.http.l.b[] arr_l$b = new p(1, this.X).b();
        com.dcinside.app.http.l.b l$b0 = arr_l$b == null ? null : arr_l$b[0];
        if(l$b0 == null) {
            return;
        }
        this.Q8 = uk.RG(this.D6(), ((String)u.z2(collection0)), l$b0).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                this.s9(true, true, "업로드 중");
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                PostWriteActivity.t9(this, false, false, null, 6, null);
            }
        }).y5((Object object0) -> {
            L.p(new o1(this), "$tmp0");
            new o1(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            com.dcinside.app.perform.e e0 = com.dcinside.app.perform.e.e.a(this);
            L.m(throwable0);
            e0.q(throwable0);
        });
    }

    // 检测为 Lambda 实现
    private static final void T5(Function1 function10, Object object0) [...]

    @SuppressLint({"ClickableViewAccessibility"})
    private final void T6() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$12", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class A extends kotlin.coroutines.jvm.internal.o implements A3.q {
            int k;
            boolean l;
            final PostWriteActivity m;

            A(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.m = postWriteActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((View)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l View view0, boolean z, @m kotlin.coroutines.d d0) {
                A postWriteActivity$A0 = new A(this.m, d0);
                postWriteActivity$A0.l = z;
                return postWriteActivity$A0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.F7(this.l);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$13", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.B extends kotlin.coroutines.jvm.internal.o implements A3.q {
            int k;
            boolean l;
            final PostWriteActivity m;

            com.dcinside.app.write.PostWriteActivity.B(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.m = postWriteActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((View)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l View view0, boolean z, @m kotlin.coroutines.d d0) {
                com.dcinside.app.write.PostWriteActivity.B postWriteActivity$B0 = new com.dcinside.app.write.PostWriteActivity.B(this.m, d0);
                postWriteActivity$B0.l = z;
                return postWriteActivity$B0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.F7(this.l);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$14", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C extends kotlin.coroutines.jvm.internal.o implements A3.q {
            int k;
            boolean l;
            final PostWriteActivity m;

            C(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.m = postWriteActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((View)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l View view0, boolean z, @m kotlin.coroutines.d d0) {
                C postWriteActivity$C0 = new C(this.m, d0);
                postWriteActivity$C0.l = z;
                return postWriteActivity$C0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.F7(this.l);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$15", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.D extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.D(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.D(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.g8();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$16", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.E extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.E(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.E(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.g8();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$17", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class F extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            Object l;
            final PostWriteActivity m;

            F(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.m = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                F postWriteActivity$F0 = new F(this.m, d0);
                postWriteActivity$F0.l = view0;
                return postWriteActivity$F0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$18", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.G extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.G(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.G(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.D7();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$19", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class H extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            H(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new H(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.D7();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$20", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class I extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            I(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new I(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.D7();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$21", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class J extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            J(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new J(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.D7();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$22", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.K extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.K(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.K(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.K9();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$24", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class M extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            M(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new M(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.N9();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$25", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.N extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.N(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.N(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.R9();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$26", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.O extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.O(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.O(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.r9();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$27", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.P extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.P(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.P(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.U8();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$28", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class Q extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            Q(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new Q(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.E9();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$29", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class R extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            R(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new R(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.W8();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$2", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.S extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.S(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.S(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.I5();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$30", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class T extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            T(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new T(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.A5();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$31", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostWriteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$initCallbacks$31\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,4099:1\n257#2,2:4100\n*S KotlinDebug\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$initCallbacks$31\n*L\n800#1:4100,2\n*E\n"})
        static final class U extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            Object l;

            U(kotlin.coroutines.d d0) {
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                U postWriteActivity$U0 = new U(d0);
                postWriteActivity$U0.l = view0;
                return postWriteActivity$U0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ((View)this.l).setVisibility(8);
                return S0.a;
            }
        }


        static final class com.dcinside.app.write.PostWriteActivity.V extends N implements Function1 {
            final PostWriteActivity e;

            com.dcinside.app.write.PostWriteActivity.V(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.r0 r00) {
                this.e.C7();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.r0)object0));
                return S0.a;
            }
        }


        static final class W extends N implements Function1 {
            final PostWriteActivity e;

            W(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(G g0) {
                L.m(g0);
                this.e.F8(g0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((G)object0));
                return S0.a;
            }
        }


        static final class X extends N implements Function1 {
            final PostWriteActivity e;

            X(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(q q0) {
                L.m(q0);
                this.e.A7(q0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((q)object0));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$3", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class Y extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            Y(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new Y(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.l8();
                return S0.a;
            }
        }


        static final class Z extends N implements Function1 {
            final PostWriteActivity e;

            Z(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.n0 n00) {
                boolean z = n00.a();
                this.e.j7(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.n0)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.write.PostWriteActivity.a0 extends N implements A3.a {
            final PostWriteActivity e;
            final VideoInfoData f;

            com.dcinside.app.write.PostWriteActivity.a0(PostWriteActivity postWriteActivity0, VideoInfoData videoInfoData0) {
                this.e = postWriteActivity0;
                this.f = videoInfoData0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.q5(this.f);
            }
        }


        static final class com.dcinside.app.write.PostWriteActivity.b0 extends N implements A3.a {
            final PostWriteActivity e;
            final String f;
            final String g;

            com.dcinside.app.write.PostWriteActivity.b0(PostWriteActivity postWriteActivity0, String s, String s1) {
                this.e = postWriteActivity0;
                this.f = s;
                this.g = s1;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.p5(this.f, this.g);
            }
        }


        static final class c0 extends N implements A3.a {
            final PostWriteActivity e;
            final Intent f;

            c0(PostWriteActivity postWriteActivity0, Intent intent0) {
                this.e = postWriteActivity0;
                this.f = intent0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.l5(this.f, false);
            }
        }


        public static final class d0 implements TextWatcher {
            final PostWriteActivity a;

            d0(PostWriteActivity postWriteActivity0) {
                this.a = postWriteActivity0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(@m Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
                this.a.K8();
            }
        }


        public static final class e0 extends com.google.android.material.appbar.AppBarLayout.Behavior.a {
            final PostWriteActivity a;

            e0(PostWriteActivity postWriteActivity0) {
                this.a = postWriteActivity0;
                super();
            }

            @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior$c
            public boolean a(@l AppBarLayout appBarLayout0) {
                L.p(appBarLayout0, "appBarLayout");
                return !this.a.o7();
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$4", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.f0 extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.f0(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.f0(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.l8();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$5", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g0 extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            g0(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g0(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.l8();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$6", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.h0 extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.h0(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.h0(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.l8();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$7", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i0 extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            i0(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new i0(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.f8();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$8", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.j0 extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.j0(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.j0(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.i8();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$9", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.k0 extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.k0(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.k0(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.M7();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$10", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.y extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.y(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.y(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.e8();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$11", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class z extends kotlin.coroutines.jvm.internal.o implements A3.q {
            int k;
            boolean l;
            final PostWriteActivity m;

            z(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.m = postWriteActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((View)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l View view0, boolean z, @m kotlin.coroutines.d d0) {
                z postWriteActivity$z0 = new z(this.m, d0);
                postWriteActivity$z0.l = z;
                return postWriteActivity$z0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.F7(this.l);
                return S0.a;
            }
        }

        g1 g10;
        b0 b00 = this.x;
        Behavior appBarLayout$Behavior0 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        com.dcinside.app.write.y0 y00 = () -> {
            L.p(this, "this$0");
            this.G8();
        };
        b00.w0.setOnNoChildClickListener(y00);
        b0 b01 = this.x;
        if(b01 == null) {
            L.S("binding");
            b01 = null;
        }
        L.o(b01.s0, "postWriteProgressCancel");
        com.dcinside.app.write.PostWriteActivity.S postWriteActivity$S0 = new com.dcinside.app.write.PostWriteActivity.S(this, null);
        r.M(b01.s0, null, postWriteActivity$S0, 1, null);
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
            b02 = null;
        }
        L.o(b02.n0, "postWriteNick");
        Y postWriteActivity$Y0 = new Y(this, null);
        r.M(b02.n0, null, postWriteActivity$Y0, 1, null);
        b0 b03 = this.x;
        if(b03 == null) {
            L.S("binding");
            b03 = null;
        }
        L.o(b03.o0, "postWritePassword");
        com.dcinside.app.write.PostWriteActivity.f0 postWriteActivity$f00 = new com.dcinside.app.write.PostWriteActivity.f0(this, null);
        r.M(b03.o0, null, postWriteActivity$f00, 1, null);
        b0 b04 = this.x;
        if(b04 == null) {
            L.S("binding");
            b04 = null;
        }
        L.o(b04.y0, "postWriteSubject");
        g0 postWriteActivity$g00 = new g0(this, null);
        r.M(b04.y0, null, postWriteActivity$g00, 1, null);
        b0 b05 = this.x;
        if(b05 == null) {
            L.S("binding");
            b05 = null;
        }
        L.o(b05.K, "postWriteCodeInput");
        com.dcinside.app.write.PostWriteActivity.h0 postWriteActivity$h00 = new com.dcinside.app.write.PostWriteActivity.h0(this, null);
        r.M(b05.K, null, postWriteActivity$h00, 1, null);
        b0 b06 = this.x;
        if(b06 == null) {
            L.S("binding");
            b06 = null;
        }
        L.o(b06.z0, "postWriteTempList");
        i0 postWriteActivity$i00 = new i0(this, null);
        r.M(b06.z0, null, postWriteActivity$i00, 1, null);
        b0 b07 = this.x;
        if(b07 == null) {
            L.S("binding");
            b07 = null;
        }
        L.o(b07.x0, "postWriteSaveTemp");
        com.dcinside.app.write.PostWriteActivity.j0 postWriteActivity$j00 = new com.dcinside.app.write.PostWriteActivity.j0(this, null);
        r.M(b07.x0, null, postWriteActivity$j00, 1, null);
        b0 b08 = this.x;
        if(b08 == null) {
            L.S("binding");
            b08 = null;
        }
        L.o(b08.M, "postWriteConfirm");
        com.dcinside.app.write.PostWriteActivity.k0 postWriteActivity$k00 = new com.dcinside.app.write.PostWriteActivity.k0(this, null);
        r.M(b08.M, null, postWriteActivity$k00, 1, null);
        b0 b09 = this.x;
        if(b09 == null) {
            L.S("binding");
            b09 = null;
        }
        L.o(b09.l0, "postWriteMiniSetting");
        com.dcinside.app.write.PostWriteActivity.y postWriteActivity$y0 = new com.dcinside.app.write.PostWriteActivity.y(this, null);
        r.M(b09.l0, null, postWriteActivity$y0, 1, null);
        b0 b010 = this.x;
        if(b010 == null) {
            L.S("binding");
            b010 = null;
        }
        L.o(b010.n0, "postWriteNick");
        z postWriteActivity$z0 = new z(this, null);
        r.P(b010.n0, null, postWriteActivity$z0, 1, null);
        b0 b011 = this.x;
        if(b011 == null) {
            L.S("binding");
            b011 = null;
        }
        L.o(b011.o0, "postWritePassword");
        A postWriteActivity$A0 = new A(this, null);
        r.P(b011.o0, null, postWriteActivity$A0, 1, null);
        b0 b012 = this.x;
        if(b012 == null) {
            L.S("binding");
            b012 = null;
        }
        L.o(b012.y0, "postWriteSubject");
        com.dcinside.app.write.PostWriteActivity.B postWriteActivity$B0 = new com.dcinside.app.write.PostWriteActivity.B(this, null);
        r.P(b012.y0, null, postWriteActivity$B0, 1, null);
        b0 b013 = this.x;
        if(b013 == null) {
            L.S("binding");
            b013 = null;
        }
        b013.y0.addTextChangedListener(this.h9);
        b0 b014 = this.x;
        if(b014 == null) {
            L.S("binding");
            b014 = null;
        }
        L.o(b014.K, "postWriteCodeInput");
        C postWriteActivity$C0 = new C(this, null);
        r.P(b014.K, null, postWriteActivity$C0, 1, null);
        b0 b015 = this.x;
        if(b015 == null) {
            L.S("binding");
            b015 = null;
        }
        L.o(b015.j0, "postWriteMenuOrderSetting");
        com.dcinside.app.write.PostWriteActivity.D postWriteActivity$D0 = new com.dcinside.app.write.PostWriteActivity.D(this, null);
        r.M(b015.j0, null, postWriteActivity$D0, 1, null);
        b0 b016 = this.x;
        if(b016 == null) {
            L.S("binding");
            b016 = null;
        }
        L.o(b016.i0, "postWriteMenuOrder");
        com.dcinside.app.write.PostWriteActivity.E postWriteActivity$E0 = new com.dcinside.app.write.PostWriteActivity.E(this, null);
        r.M(b016.i0, null, postWriteActivity$E0, 1, null);
        b0 b017 = this.x;
        if(b017 == null) {
            L.S("binding");
            b017 = null;
        }
        L.o(b017.g0, "postWriteMenuMoreIcon");
        F postWriteActivity$F0 = new F(this, null);
        r.M(b017.g0, null, postWriteActivity$F0, 1, null);
        b0 b018 = this.x;
        if(b018 == null) {
            L.S("binding");
            b018 = null;
        }
        L.o(b018.a0, "postWriteLoginArrow");
        com.dcinside.app.write.PostWriteActivity.G postWriteActivity$G0 = new com.dcinside.app.write.PostWriteActivity.G(this, null);
        r.M(b018.a0, null, postWriteActivity$G0, 1, null);
        b0 b019 = this.x;
        if(b019 == null) {
            L.S("binding");
            b019 = null;
        }
        L.o(b019.E0, "postWriteUserProfileAnonymous");
        H postWriteActivity$H0 = new H(this, null);
        r.M(b019.E0, null, postWriteActivity$H0, 1, null);
        b0 b020 = this.x;
        if(b020 == null) {
            L.S("binding");
            b020 = null;
        }
        L.o(b020.H0, "postWriteUserProfileIcon");
        I postWriteActivity$I0 = new I(this, null);
        r.M(b020.H0, null, postWriteActivity$I0, 1, null);
        b0 b021 = this.x;
        if(b021 == null) {
            L.S("binding");
            b021 = null;
        }
        L.o(b021.I0, "postWriteUserProfileName");
        J postWriteActivity$J0 = new J(this, null);
        r.M(b021.I0, null, postWriteActivity$J0, 1, null);
        b0 b022 = this.x;
        if(b022 == null) {
            L.S("binding");
            b022 = null;
        }
        b022.n0.addTextChangedListener(this.i9);
        b0 b023 = this.x;
        if(b023 == null) {
            L.S("binding");
            b023 = null;
        }
        L.o(b023.R, "postWriteDefGuestNick");
        com.dcinside.app.write.PostWriteActivity.K postWriteActivity$K0 = new com.dcinside.app.write.PostWriteActivity.K(this, null);
        r.M(b023.R, null, postWriteActivity$K0, 1, null);
        b0 b024 = this.x;
        if(b024 == null) {
            L.S("binding");
            b024 = null;
        }
        L.o(b024.D0, "postWriteUseDefNick");
        PostWriteActivity.L postWriteActivity$L0 = new PostWriteActivity.L(this, null);
        r.M(b024.D0, null, postWriteActivity$L0, 1, null);
        b0 b025 = this.x;
        if(b025 == null) {
            L.S("binding");
            b025 = null;
        }
        L.o(b025.V, "postWriteDeleteDefNick");
        M postWriteActivity$M0 = new M(this, null);
        r.M(b025.V, null, postWriteActivity$M0, 1, null);
        b0 b026 = this.x;
        if(b026 == null) {
            L.S("binding");
            b026 = null;
        }
        L.o(b026.l, "postWriteAiEasyPrompt");
        com.dcinside.app.write.PostWriteActivity.N postWriteActivity$N0 = new com.dcinside.app.write.PostWriteActivity.N(this, null);
        r.M(b026.l, null, postWriteActivity$N0, 1, null);
        b0 b027 = this.x;
        if(b027 == null) {
            L.S("binding");
            b027 = null;
        }
        L.o(b027.c, "postWriteAiEasyChara");
        com.dcinside.app.write.PostWriteActivity.O postWriteActivity$O0 = new com.dcinside.app.write.PostWriteActivity.O(this, null);
        r.M(b027.c, null, postWriteActivity$O0, 1, null);
        b0 b028 = this.x;
        if(b028 == null) {
            L.S("binding");
            b028 = null;
        }
        L.o(b028.e, "postWriteAiEasyHistory");
        com.dcinside.app.write.PostWriteActivity.P postWriteActivity$P0 = new com.dcinside.app.write.PostWriteActivity.P(this, null);
        r.M(b028.e, null, postWriteActivity$P0, 1, null);
        b0 b029 = this.x;
        if(b029 == null) {
            L.S("binding");
            b029 = null;
        }
        L.o(b029.i, "postWriteAiEasyModelSelect");
        Q postWriteActivity$Q0 = new Q(this, null);
        r.M(b029.i, null, postWriteActivity$Q0, 1, null);
        b0 b030 = this.x;
        if(b030 == null) {
            L.S("binding");
            b030 = null;
        }
        L.o(b030.w, "postWriteAiEasySetting");
        R postWriteActivity$R0 = new R(this, null);
        r.M(b030.w, null, postWriteActivity$R0, 1, null);
        b0 b031 = this.x;
        if(b031 == null) {
            L.S("binding");
            b031 = null;
        }
        L.o(b031.m, "postWriteAiEasyPromptApply");
        T postWriteActivity$T0 = new T(this, null);
        r.M(b031.m, null, postWriteActivity$T0, 1, null);
        b0 b032 = this.x;
        if(b032 == null) {
            L.S("binding");
            b032 = null;
        }
        L.o(b032.D, "postWriteAutoImageGuide");
        U postWriteActivity$U0 = new U(null);
        r.M(b032.D, null, postWriteActivity$U0, 1, null);
        b0 b033 = this.x;
        if(b033 == null) {
            L.S("binding");
            b033 = null;
        }
        b033.z.setClickable(true);
        b0 b034 = this.x;
        if(b034 == null) {
            L.S("binding");
            b034 = null;
        }
        com.dcinside.app.write.k k0 = (View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            L.m(motionEvent0);
            return this.g6(motionEvent0);
        };
        b034.z.setOnTouchListener(k0);
        F0 f00 = this.F1();
        if(f00 == null) {
            g10 = null;
        }
        else {
            RealmQuery realmQuery0 = f00.C4(B.class);
            g10 = realmQuery0 == null ? null : realmQuery0.p0();
        }
        if(g10 != null) {
            g10.l(this.W8);
        }
        this.V8 = g10;
        o o0 = com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.r0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.PostWriteActivity.V(this), "$tmp0");
            new com.dcinside.app.write.PostWriteActivity.V(this).invoke(object0);
        });
        rx.subscriptions.b b0 = this.r9;
        if(b0 != null) {
            b0.a(o0);
        }
        o o1 = com.dcinside.app.rx.bus.c.c(this, G.class).x5((Object object0) -> {
            L.p(new W(this), "$tmp0");
            new W(this).invoke(object0);
        });
        rx.subscriptions.b b1 = this.r9;
        if(b1 != null) {
            b1.a(o1);
        }
        o o2 = com.dcinside.app.rx.bus.c.c(this, q.class).x5((Object object0) -> {
            L.p(new X(this), "$tmp0");
            new X(this).invoke(object0);
        });
        rx.subscriptions.b b2 = this.r9;
        if(b2 != null) {
            b2.a(o2);
        }
        com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.n0.class).x5((Object object0) -> {
            L.p(new Z(this), "$tmp0");
            new Z(this).invoke(object0);
        });
        this.y9 = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 == null) {
                    return;
                }
                VideoInfoData videoInfoData0 = (VideoInfoData)IntentCompat.d(intent0, "com.dcinside.app.write.menu.VideoSettingActivity_EXTRA_VIDEO_INFO_RESULT_DATA", VideoInfoData.class);
                if(videoInfoData0 == null) {
                    return;
                }
                this.q6(new com.dcinside.app.write.PostWriteActivity.a0(this, videoInfoData0));
            }
        });
        this.z9 = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            String s1;
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                String s = "";
                if(intent0 == null) {
                    s1 = "";
                }
                else {
                    s1 = intent0.getStringExtra("extra_series_html_data");
                    if(s1 == null) {
                        s1 = "";
                    }
                }
                Intent intent1 = activityResult0.a();
                if(intent1 != null) {
                    String s2 = intent1.getStringExtra("extra_series_json_data");
                    if(s2 != null) {
                        s = s2;
                    }
                }
                this.q6(new com.dcinside.app.write.PostWriteActivity.b0(this, s1, s));
            }
        });
        this.A9 = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 == null) {
                    return;
                }
                this.q6(new c0(this, intent0));
            }
        });
        this.F9 = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 == null) {
                    return;
                }
                Set set0 = intent0.getBooleanExtra("extra_take_image_from_android", false) ? Gk.t(intent0) : intent0.getStringArrayListExtra("intent_path");
                if(set0 == null) {
                    return;
                }
                this.w6(set0);
            }
        });
        this.G9 = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 == null) {
                    return;
                }
                String s = intent0.getStringExtra("app.write.menu.ai.chara.EXTRA_SELECTED_PROMPT");
                b0 b00 = this.x;
                b0 b01 = null;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                Editable editable0 = b00.n.getText();
                b0 b02 = this.x;
                if(b02 == null) {
                    L.S("binding");
                    b02 = null;
                }
                b02.n.requestFocus();
                L.m(editable0);
                if(editable0.length() == 0) {
                    b0 b03 = this.x;
                    if(b03 == null) {
                        L.S("binding");
                        b03 = null;
                    }
                    b03.n.setText(s);
                }
                else {
                    b0 b04 = this.x;
                    if(b04 == null) {
                        L.S("binding");
                        b04 = null;
                    }
                    String s1 = this.getString(0x7F1501DA, new Object[]{s, editable0});  // string:chara_prompt_result "%1$s,\n%2$s"
                    b04.n.setText(s1);
                }
                b0 b05 = this.x;
                if(b05 == null) {
                    L.S("binding");
                    b05 = null;
                }
                EditText editText0 = b05.n;
                b0 b06 = this.x;
                if(b06 == null) {
                    L.S("binding");
                }
                else {
                    b01 = b06;
                }
                editText0.setSelection(b01.n.getSelectionEnd());
            }
        });
        this.T9 = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "<anonymous parameter 0>");
            this.L5();
        });
        this.S9 = new GestureDetectorCompat(this, this);
        InputFilter.LengthFilter inputFilter$LengthFilter0 = new InputFilter.LengthFilter(2000);
        com.dcinside.app.write.Z0 z00 = (CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) -> {
            L.p(new kotlin.text.r("[ㄱ-ㅎㅏ-ㅣ가-힣]"), "$regex");
            L.m(charSequence0);
            return new kotlin.text.r("[ㄱ-ㅎㅏ-ㅣ가-힣]").m(charSequence0, "");
        };
        b0 b035 = this.x;
        if(b035 == null) {
            L.S("binding");
            b035 = null;
        }
        b035.n.setFilters(new InputFilter[]{inputFilter$LengthFilter0, z00});
        b0 b036 = this.x;
        if(b036 == null) {
            L.S("binding");
            b036 = null;
        }
        d0 postWriteActivity$d00 = new d0(this);
        b036.n.addTextChangedListener(postWriteActivity$d00);
        b0 b037 = this.x;
        if(b037 == null) {
            L.S("binding");
            b037 = null;
        }
        b037.u.setNestedScrollingEnabled(false);
        b0 b038 = this.x;
        if(b038 == null) {
            L.S("binding");
            b038 = null;
        }
        b038.u.setItemAnimator(null);
        b0 b039 = this.x;
        if(b039 == null) {
            L.S("binding");
            b039 = null;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = b039.A.getLayoutParams();
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams coordinatorLayout$LayoutParams0 = viewGroup$LayoutParams0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams ? ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)viewGroup$LayoutParams0) : null;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0 == null ? null : coordinatorLayout$LayoutParams0.f();
        if(coordinatorLayout$Behavior0 instanceof Behavior) {
            appBarLayout$Behavior0 = (Behavior)coordinatorLayout$Behavior0;
        }
        if(appBarLayout$Behavior0 == null) {
            appBarLayout$Behavior0 = new Behavior();
        }
        appBarLayout$Behavior0.K0(new e0(this));
        if(coordinatorLayout$LayoutParams0 != null) {
            coordinatorLayout$LayoutParams0.q(appBarLayout$Behavior0);
        }
    }

    // 检测为 Lambda 实现
    private static final void T7(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    private final void T8() {
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        RecyclerView recyclerView0 = b00.u;
        L.o(recyclerView0, "postWriteAiEasySelectModeList");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams)viewGroup$LayoutParams0).height = 0;
        recyclerView0.setLayoutParams(((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams)viewGroup$LayoutParams0));
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
            b02 = null;
        }
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(this, 0, false);
        b02.u.setLayoutManager(linearLayoutManager0);
        b0 b03 = this.x;
        if(b03 == null) {
            L.S("binding");
            b03 = null;
        }
        com.dcinside.app.write.menu.ai.model.a a0 = this.J6();
        b03.u.setAdapter(a0);
        int v = this.J6().v();
        b0 b04 = this.x;
        if(b04 == null) {
            L.S("binding");
            b04 = null;
        }
        LayoutManager recyclerView$LayoutManager0 = b04.u.getLayoutManager();
        LinearLayoutManager linearLayoutManager1 = recyclerView$LayoutManager0 instanceof LinearLayoutManager ? ((LinearLayoutManager)recyclerView$LayoutManager0) : null;
        if(linearLayoutManager1 == null) {
            return;
        }
        linearLayoutManager1.q3(v, 0);
        b0 b05 = this.x;
        if(b05 == null) {
            L.S("binding");
            b05 = null;
        }
        L.o(b05.r, "postWriteAiEasySelect");
        b05.r.setVisibility(0);
        b0 b06 = this.x;
        if(b06 == null) {
            L.S("binding");
            b06 = null;
        }
        b06.v.setText("모델");
        b0 b07 = this.x;
        if(b07 == null) {
            L.S("binding");
            b07 = null;
        }
        b07.s.setText(null);
        b0 b08 = this.x;
        if(b08 == null) {
            L.S("binding");
            b08 = null;
        }
        PickedBottomIndicatorView pickedBottomIndicatorView0 = b08.t;
        b0 b09 = this.x;
        if(b09 == null) {
            L.S("binding");
            b09 = null;
        }
        L.o(b09.i, "postWriteAiEasyModelSelect");
        pickedBottomIndicatorView0.a(b09.i, 0.5f);
        b0 b010 = this.x;
        if(b010 == null) {
            L.S("binding");
            b010 = null;
        }
        L.o(b010.t, "postWriteAiEasySelectModeIndicator");
        b010.t.setVisibility(0);
        b0 b011 = this.x;
        if(b011 == null) {
            L.S("binding");
        }
        else {
            b01 = b011;
        }
        L.o(b01.q, "postWriteAiEasyRecentEmpty");
        b01.q.setVisibility(8);
    }

    // 检测为 Lambda 实现
    private static final void T9(PostWriteActivity postWriteActivity0) [...]

    @Override  // com.dcinside.app.write.h1$b
    public boolean U() {
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        return b00.h0.getVisibility() == 0;
    }

    // 检测为 Lambda 实现
    private static final void U5(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final boolean U6(PostWriteActivity postWriteActivity0, View view0, MotionEvent motionEvent0) [...]

    private final void U7() {
        static final class E0 extends N implements Function1 {
            final PostWriteActivity e;

            E0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(com.dcinside.app.model.f0 f00) {
                if(f00.f()) {
                    this.e.z9(true);
                    this.e.A8();
                    return;
                }
                Dl.G(this.e, f00.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.f0)object0));
                return S0.a;
            }
        }

        String s = null;
        if(!this.p9) {
            if(this.q7()) {
                PostModify postModify0 = this.A;
                if(postModify0 != null) {
                    s = postModify0.V().toString();
                }
            }
            o o0 = this.P8;
            if(o0 != null) {
                o0.l();
            }
            this.P8 = uk.Xj(this.D6(), s).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
                L.p(new E0(this), "$tmp0");
                new E0(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                Dl.D(this, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
            });
            return;
        }
        this.z9(false);
        this.A8();
    }

    private final void U8() {
        if(!this.o7()) {
            this.V8();
            return;
        }
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        if(L.g(b00.u.getAdapter(), this.L6())) {
            this.Q6();
            return;
        }
        this.V8();
    }

    // 检测为 Lambda 实现
    private static final void U9(PostWriteActivity postWriteActivity0) [...]

    private final void V5() {
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        CharSequence charSequence0 = b00.R.getText();
        int v = 8;
        if(charSequence0 != null && charSequence0.length() != 0) {
            b0 b02 = this.x;
            if(b02 == null) {
                L.S("binding");
                b02 = null;
            }
            Editable editable0 = b02.n0.getText();
            String s = editable0 == null ? null : editable0.toString();
            boolean z = s == null || s.length() == 0;
            if(this.g9 && z) {
                this.g9 = false;
                b0 b03 = this.x;
                if(b03 == null) {
                    L.S("binding");
                    b03 = null;
                }
                L.o(b03.S, "postWriteDefGuestWrap");
                b03.S.setVisibility(0);
                b0 b04 = this.x;
                if(b04 == null) {
                    L.S("binding");
                    b04 = null;
                }
                L.o(b04.V, "postWriteDeleteDefNick");
                b04.V.setVisibility(8);
                b0 b05 = this.x;
                if(b05 == null) {
                    L.S("binding");
                    b05 = null;
                }
                L.o(b05.R, "postWriteDefGuestNick");
                b05.R.setVisibility(0);
                b0 b06 = this.x;
                if(b06 == null) {
                    L.S("binding");
                }
                else {
                    b01 = b06;
                }
                L.o(b01.D0, "postWriteUseDefNick");
                b01.D0.setVisibility(8);
                return;
            }
            this.g9 = false;
            b0 b07 = this.x;
            if(b07 == null) {
                L.S("binding");
                b07 = null;
            }
            L.o(b07.S, "postWriteDefGuestWrap");
            b07.S.setVisibility(8);
            b0 b08 = this.x;
            if(b08 == null) {
                L.S("binding");
            }
            else {
                b01 = b08;
            }
            TextView textView0 = b01.D0;
            L.o(textView0, "postWriteUseDefNick");
            if(z) {
                v = 0;
            }
            textView0.setVisibility(v);
            return;
        }
        b0 b09 = this.x;
        if(b09 == null) {
            L.S("binding");
            b09 = null;
        }
        L.o(b09.S, "postWriteDefGuestWrap");
        b09.S.setVisibility(8);
        b0 b010 = this.x;
        if(b010 == null) {
            L.S("binding");
        }
        else {
            b01 = b010;
        }
        L.o(b01.D0, "postWriteUseDefNick");
        b01.D0.setVisibility(8);
    }

    // 检测为 Lambda 实现
    private static final void V6(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void V7(Function1 function10, Object object0) [...]

    private final void V8() {
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        RecyclerView recyclerView0 = b00.u;
        L.o(recyclerView0, "postWriteAiEasySelectModeList");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams)viewGroup$LayoutParams0).height = 0;
        recyclerView0.setLayoutParams(((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams)viewGroup$LayoutParams0));
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
            b02 = null;
        }
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(this, 1, false);
        b02.u.setLayoutManager(linearLayoutManager0);
        b0 b03 = this.x;
        if(b03 == null) {
            L.S("binding");
            b03 = null;
        }
        v0 v00 = this.L6();
        b03.u.setAdapter(v00);
        g1 g10 = this.P9;
        if(g10 != null) {
            this.L6().G(g10);
        }
        b0 b04 = this.x;
        if(b04 == null) {
            L.S("binding");
            b04 = null;
        }
        L.o(b04.r, "postWriteAiEasySelect");
        b04.r.setVisibility(0);
        b0 b05 = this.x;
        if(b05 == null) {
            L.S("binding");
            b05 = null;
        }
        b05.v.setText("최근 등록 프롬프트");
        b0 b06 = this.x;
        if(b06 == null) {
            L.S("binding");
            b06 = null;
        }
        b06.s.setText(String.valueOf((this.P9 == null ? 0 : this.P9.size())));
        b0 b07 = this.x;
        if(b07 == null) {
            L.S("binding");
            b07 = null;
        }
        L.o(b07.q, "postWriteAiEasyRecentEmpty");
        int v = 8;
        b07.q.setVisibility((this.P9 == null || this.P9.isEmpty() ? 0 : 8));
        b0 b08 = this.x;
        if(b08 == null) {
            L.S("binding");
            b08 = null;
        }
        TextView textView0 = b08.s;
        L.o(textView0, "postWriteAiEasySelectModeCount");
        if(this.P9 != null && !this.P9.isEmpty() == 1) {
            v = 0;
        }
        textView0.setVisibility(v);
        b0 b09 = this.x;
        if(b09 == null) {
            L.S("binding");
            b09 = null;
        }
        PickedBottomIndicatorView pickedBottomIndicatorView0 = b09.t;
        b0 b010 = this.x;
        if(b010 == null) {
            L.S("binding");
            b010 = null;
        }
        L.o(b010.e, "postWriteAiEasyHistory");
        pickedBottomIndicatorView0.a(b010.e, 0.0f);
        b0 b011 = this.x;
        if(b011 == null) {
            L.S("binding");
        }
        else {
            b01 = b011;
        }
        L.o(b01.t, "postWriteAiEasySelectModeIndicator");
        b01.t.setVisibility(0);
    }

    // 检测为 Lambda 实现
    private static final void V9(Function1 function10, Object object0) [...]

    private final void W5(A3.a a0) {
        static final class com.dcinside.app.write.PostWriteActivity.p extends N implements Function1 {
            final PostWriteActivity e;
            final A3.a f;

            com.dcinside.app.write.PostWriteActivity.p(PostWriteActivity postWriteActivity0, A3.a a0) {
                this.e = postWriteActivity0;
                this.f = a0;
                super(1);
            }

            public final void a(com.dcinside.app.model.f0 f00) {
                if(f00.f()) {
                    this.e.X8 = true;
                    this.f.invoke();
                    return;
                }
                this.e.L9(f00.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.f0)object0));
                return S0.a;
            }
        }

        if(this.C6() == com.dcinside.app.type.m.g) {
            a0.invoke();
            return;
        }
        if(B.E.k0() != null) {
            a0.invoke();
            return;
        }
        if(this.X8) {
            a0.invoke();
            return;
        }
        o o0 = this.Y8;
        if(o0 != null) {
            o0.l();
        }
        this.Y8 = uk.Qj(this.D6()).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.H.setVisibility(0);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.H.setVisibility(8);
            }
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.PostWriteActivity.p(this, a0), "$tmp0");
            new com.dcinside.app.write.PostWriteActivity.p(this, a0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            com.dcinside.app.perform.e e0 = com.dcinside.app.perform.e.e.a(this);
            L.m(throwable0);
            e0.q(throwable0);
        });
    }

    // 检测为 Lambda 实现
    private static final void W6(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void W7(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    public final void W8() {
        com.dcinside.app.util.Nk.a nk$a0 = Nk.a;
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        nk$a0.c(b00.n);
        Intent intent0 = new Intent(this, WriteSettingActivity.class);
        intent0.putExtra("EXTRA_OPEN_POST_WRITE", true);
        ActivityResultLauncher activityResultLauncher0 = this.T9;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.b(intent0);
        }
    }

    // 检测为 Lambda 实现
    private static final void W9(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void X5(PostWriteActivity postWriteActivity0) [...]

    // 检测为 Lambda 实现
    private static final void X6(Function1 function10, Object object0) [...]

    private final void X7() {
        YoutubeSearchActivity.F.a(this, (this.z == null ? null : this.z.s()), 0x3F6);
    }

    private final void X8() {
        boolean z = true;
        if(!this.q7()) {
            b0 b00 = this.x;
            String s = null;
            if(b00 == null) {
                L.S("binding");
                b00 = null;
            }
            L.o(b00.W, "postWriteGuest");
            if(b00.W.getVisibility() == 0) {
                b0 b01 = this.x;
                if(b01 == null) {
                    L.S("binding");
                    b01 = null;
                }
                String s1 = kotlin.text.v.G5(String.valueOf(b01.n0.getText())).toString();
                if(this.Z9()) {
                    b0 b02 = this.x;
                    if(b02 == null) {
                        L.S("binding");
                        b02 = null;
                    }
                    s1 = kotlin.text.v.G5(b02.R.getText().toString()).toString();
                }
                b0 b03 = this.x;
                if(b03 == null) {
                    L.S("binding");
                    b03 = null;
                }
                String s2 = String.valueOf(b03.o0.getText());
                try {
                    if(!m0.a.a.f(new CharSequence[]{s1, s2})) {
                        GalleryInfo galleryInfo0 = this.z;
                        if(galleryInfo0 == null) {
                            z = false;
                        }
                        else {
                            String s3 = galleryInfo0.c();
                            if(s3 == null || s3.length() <= 0) {
                                z = false;
                            }
                        }
                        com.dcinside.app.realm.t.a t$a0 = com.dcinside.app.realm.t.i;
                        if(!z && !this.Z9()) {
                            s = s1;
                        }
                        t$a0.c(s, s2);
                        if(this.G5()) {
                            boolean z1 = this.Z9();
                            dl.a.m6(z1);
                        }
                    }
                    goto label_43;
                }
                catch(Exception exception0) {
                }
                timber.log.b.a.y(exception0);
            }
        }
        try {
        label_43:
            long v = this.J;
            if(v != 0L) {
                F0 f00 = this.F1();
                if(f00 == null) {
                    return;
                }
                f00.Y3((F0 f01) -> {
                    L.p(f00, "$realm");
                    L.p(f01, "r");
                    j0 j00 = (j0)f01.C4(j0.class).g0("time", v).r0();
                    if(j00 != null && j00.s()) {
                        List list0 = u.k(j00);
                        j0.h.b(f00, list0);
                    }
                });
            }
            if(this.l9 > 0L) {
                F0 f01 = this.F1();
                if(f01 == null) {
                    return;
                }
                f01.Y3((F0 f01) -> {
                    L.p(this, "this$0");
                    L.p(f01, "$realm");
                    L.p(f01, "r");
                    j0 j00 = (j0)f01.C4(j0.class).g0("time", this.l9).r0();
                    if(j00 != null && j00.s()) {
                        List list0 = u.k(j00);
                        j0.h.b(f01, list0);
                    }
                });
            }
        }
        catch(Exception exception1) {
            timber.log.b.a.y(exception1);
        }
    }

    private final void X9() {
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.n0.setEnabled(false);
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
            b02 = null;
        }
        L.o(b02.S, "postWriteDefGuestWrap");
        b02.S.setVisibility(0);
        b0 b03 = this.x;
        if(b03 == null) {
            L.S("binding");
            b03 = null;
        }
        L.o(b03.R, "postWriteDefGuestNick");
        b03.R.setVisibility(0);
        b0 b04 = this.x;
        if(b04 == null) {
            L.S("binding");
            b04 = null;
        }
        L.o(b04.V, "postWriteDeleteDefNick");
        b04.V.setVisibility(8);
        b0 b05 = this.x;
        if(b05 == null) {
            L.S("binding");
        }
        else {
            b01 = b05;
        }
        L.o(b01.D0, "postWriteUseDefNick");
        b01.D0.setVisibility(8);
    }

    // 检测为 Lambda 实现
    private static final void Y5(PostWriteActivity postWriteActivity0) [...]

    // 检测为 Lambda 实现
    private static final void Y6(Function1 function10, Object object0) [...]

    private final void Y7(boolean z) {
        static final class com.dcinside.app.write.PostWriteActivity.F0 extends N implements Function1 {
            final boolean e;
            final PostWriteActivity f;
            final long g;

            com.dcinside.app.write.PostWriteActivity.F0(boolean z, PostWriteActivity postWriteActivity0, long v) {
                this.e = z;
                this.f = postWriteActivity0;
                this.g = v;
                super(1);
            }

            public final void a(AiImageStatusResult aiImageStatusResult0) {
                static final class com.dcinside.app.write.PostWriteActivity.F0.a extends N implements Function1 {
                    final PostWriteActivity e;
                    final AiImageStatusResult f;

                    com.dcinside.app.write.PostWriteActivity.F0.a(PostWriteActivity postWriteActivity0, AiImageStatusResult aiImageStatusResult0) {
                        this.e = postWriteActivity0;
                        this.f = aiImageStatusResult0;
                        super(1);
                    }

                    @m
                    public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                        L.p(p$a0, "b");
                        p$a0.J(0x7F150590);  // string:make_ai_image_error_title "AI 이미지 생성 가능 횟수 초과"
                        return p$a0.n(this.e.getString(0x7F15058F, new Object[]{this.f.y()}));  // string:make_ai_image_error_message "AI 이미지는 일일 %d회까지 생성할 수 있습니다. 내일 다시 시도해주세요."
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((com.dcinside.app.perform.p.a)object0));
                    }
                }

                if(L.g(aiImageStatusResult0.v(), Boolean.TRUE) && aiImageStatusResult0.u() > 0) {
                    if(this.e) {
                        L.m(aiImageStatusResult0);
                        this.f.J9(aiImageStatusResult0);
                        return;
                    }
                    boolean z = this.f.C6() != com.dcinside.app.type.m.g;
                    String s = this.f.D6();
                    L.m(aiImageStatusResult0);
                    AiImageMakeActivity.X8.a(this.f, s, aiImageStatusResult0, this.g, z, this.f.A9);
                    return;
                }
                com.dcinside.app.perform.e.e.a(this.f).n(new com.dcinside.app.write.PostWriteActivity.F0.a(this.f, aiImageStatusResult0)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((AiImageStatusResult)object0));
                return S0.a;
            }
        }


        static final class G0 extends N implements Function1 {
            final Throwable e;

            G0(Throwable throwable0) {
                this.e = throwable0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e.getMessage());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        String s = B.E.k0();
        if((s == null || s.length() == 0) && !jl.a.D()) {
            L.o("AI 이미지는 고정닉만 생성할 수 있습니다.", "getString(...)");
            com.dcinside.app.internal.c.w(this, "AI 이미지는 고정닉만 생성할 수 있습니다.");
            return;
        }
        long v = this.F6() - ((long)this.L.O());
        if(v < 1L) {
            String s1 = this.getString(0x7F1507FE, new Object[]{this.F6()});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
            L.o(s1, "getString(...)");
            Dl.G(this, s1);
            return;
        }
        o o0 = this.b9;
        if(o0 != null) {
            o0.l();
        }
        this.b9 = uk.wk(false).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.H.setVisibility(0);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.H.setVisibility(8);
            }
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.PostWriteActivity.F0(z, this, v), "$tmp0");
            new com.dcinside.app.write.PostWriteActivity.F0(z, this, v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            com.dcinside.app.perform.e.e.a(this).n(new G0(throwable0)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
        });
    }

    // 检测为 Lambda 实现
    private static final void Y8(long v, F0 f00, F0 f01) [...]

    // 检测为 Lambda 实现
    private static final void Y9(PostWriteActivity postWriteActivity0, g1 g10) [...]

    // 检测为 Lambda 实现
    private static final void Z5(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void Z6(PostWriteActivity postWriteActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void Z7(PostWriteActivity postWriteActivity0) [...]

    // 检测为 Lambda 实现
    private static final void Z8(PostWriteActivity postWriteActivity0, F0 f00, F0 f01) [...]

    private final boolean Z9() {
        if(this.G5()) {
            b0 b00 = this.x;
            if(b00 == null) {
                L.S("binding");
                b00 = null;
            }
            L.o(b00.S, "postWriteDefGuestWrap");
            return b00.S.getVisibility() == 0;
        }
        return false;
    }

    @Override  // com.dcinside.app.write.h1$c
    public void a0(@l com.dcinside.app.model.p p0) {
        L.p(p0, "icon");
        this.R6(p0);
    }

    // 检测为 Lambda 实现
    private static final void a6(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void a7(PostWriteActivity postWriteActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void a8(PostWriteActivity postWriteActivity0) [...]

    // 检测为 Lambda 实现
    private static final void a9(PostWriteActivity postWriteActivity0, g1 g10) [...]

    private final void b6() {
    }

    // 检测为 Lambda 实现
    private static final void b7(PostWriteActivity postWriteActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void b8(Function1 function10, Object object0) [...]

    private final void b9() {
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        TextView textView0 = b00.E0;
        L.o(textView0, "postWriteUserProfileAnonymous");
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
            b02 = null;
        }
        ImageView imageView0 = b02.a0;
        L.o(imageView0, "postWriteLoginArrow");
        b0 b03 = this.x;
        if(b03 == null) {
            L.S("binding");
            b03 = null;
        }
        TextView textView1 = b03.I0;
        L.o(textView1, "postWriteUserProfileName");
        b0 b04 = this.x;
        if(b04 == null) {
            L.S("binding");
        }
        else {
            b01 = b04;
        }
        ImageView imageView1 = b01.H0;
        L.o(imageView1, "postWriteUserProfileIcon");
        int v = 8;
        if(!dl.a.a3()) {
            textView0.setVisibility(8);
            imageView0.setVisibility(8);
            textView1.setVisibility(8);
            imageView1.setVisibility(8);
            return;
        }
        B b0 = this.U8;
        com.dcinside.app.main.login.g g0 = com.dcinside.app.main.login.g.a;
        boolean z = g0.p();
        int v1 = 0;
        boolean z1 = this.z != null && this.z.J();
        boolean z2 = z && !this.q7() && !z1;
        GalleryInfo galleryInfo0 = this.z;
        if(galleryInfo0 != null) {
            String s = galleryInfo0.c();
            if(s != null && s.length() > 0) {
                textView0.setVisibility((b0 == null && !z2 ? 8 : 0));
                if(!z2) {
                    v1 = 8;
                }
                imageView0.setVisibility(v1);
                textView1.setVisibility(8);
                imageView1.setVisibility(8);
                return;
            }
        }
        if(b0 != null) {
            textView0.setVisibility(8);
            imageView0.setVisibility((z2 ? 0 : 8));
            String s1 = b0.o6();
            if(s1 != null && s1.length() != 0) {
                textView1.setVisibility(8);
                imageView1.setVisibility(0);
                imageView1.clearColorFilter();
                com.dcinside.app.glide.a.l(imageView1).g0().v2(b0.o6()).U1().q1(imageView1);
                return;
            }
            textView1.setVisibility(0);
            imageView1.setVisibility(8);
            g0.g(textView1, b0);
            return;
        }
        textView0.setVisibility(8);
        textView1.setVisibility(8);
        imageView0.setVisibility((z2 ? 0 : 8));
        if(z2) {
            v = 0;
        }
        imageView1.setVisibility(v);
        if(z2) {
            imageView1.setColorFilter(vk.b(this, 0x7F04021E));  // attr:dcToolbarTextColor
            com.dcinside.app.glide.a.l(imageView1).r0(0x7F0803AD).q1(imageView1);  // drawable:ip_vector
        }
    }

    public final void c6() {
        static final class com.dcinside.app.write.PostWriteActivity.q extends N implements Function1 {
            final PostWriteActivity e;

            com.dcinside.app.write.PostWriteActivity.q(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void b(String s) {
                this.e.f6();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        if(this.e9) {
            return;
        }
        o o0 = this.f9;
        if(o0 != null) {
            o0.l();
        }
        this.f9 = rx.g.Q2("").w1(2L, TimeUnit.SECONDS).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.PostWriteActivity.q(this), "$tmp0");
            new com.dcinside.app.write.PostWriteActivity.q(this).invoke(object0);
        }, new com.dcinside.app.write.F());
    }

    // 检测为 Lambda 实现
    private static final void c7(PostWriteActivity postWriteActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void c8(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    private final void c9(f f0, int v, boolean z) {
        @s0({"SMAP\nPostWriteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$requestMakeAiImage$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4099:1\n1#2:4100\n*E\n"})
        static final class e1 extends N implements Function1 {
            final PostWriteActivity e;
            final boolean f;
            final int g;
            final f h;

            e1(PostWriteActivity postWriteActivity0, boolean z, int v, f f0) {
                this.e = postWriteActivity0;
                this.f = z;
                this.g = v;
                this.h = f0;
                super(1);
            }

            public final void a(com.dcinside.app.model.g g0) {
                static final class com.dcinside.app.write.PostWriteActivity.e1.a extends N implements A3.a {
                    final PostWriteActivity e;
                    final f f;
                    final int g;
                    final boolean h;

                    com.dcinside.app.write.PostWriteActivity.e1.a(PostWriteActivity postWriteActivity0, f f0, int v, boolean z) {
                        this.e = postWriteActivity0;
                        this.f = f0;
                        this.g = v;
                        this.h = z;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.c9(this.f, this.g, this.h);
                    }
                }

                if(L.g(g0.k(), Boolean.TRUE)) {
                    String s = g0.h();
                    if(s != null) {
                        PostWriteActivity postWriteActivity0 = this.e;
                        int v = this.g;
                        f f0 = this.h;
                        if(this.f) {
                            Intent intent0 = new Intent();
                            intent0.putExtra("EXTRA_AI_IMAGE_RESULT_DATA", s);
                            postWriteActivity0.l5(intent0, true);
                        }
                        else {
                            postWriteActivity0.L.t0(s, v, g0.j());
                        }
                        F0 f00 = postWriteActivity0.F1();
                        if(f00 != null) {
                            com.dcinside.app.realm.b.m.d(f00, f0);
                        }
                    }
                }
                else {
                    boolean z = L.g(g0.l(), Boolean.TRUE);
                    com.dcinside.app.write.PostWriteActivity.e1.a postWriteActivity$e1$a0 = new com.dcinside.app.write.PostWriteActivity.e1.a(this.e, this.h, this.g, this.f);
                    this.e.v8(z, postWriteActivity$e1$a0);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.g)object0));
                return S0.a;
            }
        }


        static final class f1 extends N implements A3.a {
            final PostWriteActivity e;
            final f f;
            final int g;
            final boolean h;

            f1(PostWriteActivity postWriteActivity0, f f0, int v, boolean z) {
                this.e = postWriteActivity0;
                this.f = f0;
                this.g = v;
                this.h = z;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.c9(this.f, this.g, this.h);
            }
        }

        f0.k(this.D6());
        this.u9 = uk.vG(f0, !z).R1(() -> {
            L.p(this, "this$0");
            if(this.q1() && z) {
                b0 b00 = this.x;
                b0 b01 = null;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.k.setVisibility(8);
                b0 b02 = this.x;
                if(b02 == null) {
                    L.S("binding");
                }
                else {
                    b01 = b02;
                }
                b01.o.setVisibility(0);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1() && z) {
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.o.setVisibility(8);
            }
        }).y5((Object object0) -> {
            L.p(new e1(this, z, v, f0), "$tmp0");
            new e1(this, z, v, f0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(f0, "$args");
            this.v8(false, new f1(this, f0, v, z));
        });
    }

    @Override  // com.dcinside.app.write.h1$c
    public boolean d(@l com.dcinside.app.voice.m m0, boolean z) {
        static final class a1 extends N implements Function1 {
            public static final a1 e;

            static {
                a1.e = new a1();
            }

            a1() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150B93);  // string:voice_subject_empty "보이스 제목(설명)이 입력되지 않았습니다.\n제목(설명) 없이 등록하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class b1 extends N implements Function1 {
            public static final b1 e;

            static {
                b1.e = new b1();
            }

            b1() {
                super(1);
            }

            public final Boolean a(@m Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class c1 extends N implements Function1 {
            final PostWriteActivity e;
            final com.dcinside.app.voice.m f;
            final String g;
            final boolean h;

            c1(PostWriteActivity postWriteActivity0, com.dcinside.app.voice.m m0, String s, boolean z) {
                this.e = postWriteActivity0;
                this.f = m0;
                this.g = s;
                this.h = z;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.r5(this.f, this.g, this.h);
                this.e.P.n();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(m0, "view");
        if(m0.getInputType() == com.dcinside.app.voice.m.l.a) {
            String s = m0.getTitle();
            if(TextUtils.isEmpty(s)) {
                com.dcinside.app.perform.e.e.a(this).n(a1.e).z(0x7F150B91).x(0x7F150B92).b().Z1((Object object0) -> {
                    L.p(b1.e, "$tmp0");
                    return (Boolean)b1.e.invoke(object0);
                }).y5((Object object0) -> {
                    L.p(new c1(this, m0, s, z), "$tmp0");
                    new c1(this, m0, s, z).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this, "this$0");
                    timber.log.b.a.y(throwable0);
                    Dl.D(this, 0x7F150B94);  // string:voice_subject_error "보이스 입력에 실패하였습니다."
                });
                return false;
            }
            this.r5(m0, s, z);
            return true;
        }
        this.r5(m0, null, z);
        return true;
    }

    // 检测为 Lambda 实现
    private static final void d6(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void d7(PostWriteActivity postWriteActivity0, ActivityResult activityResult0) [...]

    private final void d8() {
        if(((long)this.L.O()) >= this.F6()) {
            String s = this.getString(0x7F1507FE, new Object[]{this.F6()});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
            L.o(s, "getString(...)");
            Dl.G(this, s);
            return;
        }
        if(cl.i(this, this)) {
            this.D = 0x72;
            return;
        }
        Intent intent0 = new Intent(this, AlbumActivity.class);
        intent0.putExtra("extra_enter_gif", true);
        this.startActivityForResult(intent0, 0x402);
    }

    static void d9(PostWriteActivity postWriteActivity0, f f0, int v, boolean z, int v1, Object object0) {
        if((v1 & 4) != 0) {
            z = false;
        }
        postWriteActivity0.c9(f0, v, z);
    }

    private static final void e6(Throwable throwable0) {
    }

    // 检测为 Lambda 实现
    private static final void e7(PostWriteActivity postWriteActivity0, ActivityResult activityResult0) [...]

    private final void e8() {
        String s = null;
        MenuVisible menuVisible0 = this.t9 == null ? null : this.t9.d();
        com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.a writeMiniSettingActivity$a0 = WriteMiniSettingActivity.z;
        String s1 = this.o9;
        boolean z = this.q9;
        String s2 = this.n9;
        boolean z1 = this.p9;
        String s3 = this.D6();
        PostModify postModify0 = this.A;
        if(postModify0 != null) {
            s = postModify0.V().toString();
        }
        writeMiniSettingActivity$a0.a(this, s1, z, s2, z1, menuVisible0, s3, s);
    }

    // 检测为 Lambda 实现
    private static final void e9(PostWriteActivity postWriteActivity0, boolean z) [...]

    private final void f6() {
        if(!this.e9) {
            this.e9 = true;
            this.v6();
        }
    }

    // 检测为 Lambda 实现
    private static final CharSequence f7(kotlin.text.r r0, CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) [...]

    private final void f8() {
        m0.a.a a$a0 = m0.a.a;
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        boolean z = a$a0.k(String.valueOf(b00.y0.getText()));
        boolean z1 = true;
        if(!z) {
            z = !this.L.W();
        }
        if(!z && this.L.getItemCount() == 1) {
            Object object0 = this.L.S().get(0);
            L.o(object0, "get(...)");
            if(!k0.r.B(((k0)object0)) && !k0.r.L(((k0)object0))) {
                z1 = false;
            }
            z = z1;
        }
        this.x9.b(this, z);
    }

    // 检测为 Lambda 实现
    private static final void f9(PostWriteActivity postWriteActivity0, boolean z) [...]

    @Override  // android.app.Activity
    public void finish() {
        Nk.a.a(this);
        super.finish();
    }

    // 去混淆评级： 低(20)
    private final boolean g6(MotionEvent motionEvent0) {
        return this.S9 != null && this.S9.b(motionEvent0) ? true : this.P8(motionEvent0);
    }

    // 检测为 Lambda 实现
    private static final void g7(PostWriteActivity postWriteActivity0) [...]

    private final void g8() {
        WriteMenuOrderActivity.x.a(this, (this.t9 == null ? null : this.t9.d()));
    }

    // 检测为 Lambda 实现
    private static final void g9(Function1 function10, Object object0) [...]

    private final void h6(A3.a a0) {
        static final class com.dcinside.app.write.PostWriteActivity.r extends N implements Function1 {
            final PostWriteActivity e;
            final A3.a f;

            com.dcinside.app.write.PostWriteActivity.r(PostWriteActivity postWriteActivity0, A3.a a0) {
                this.e = postWriteActivity0;
                this.f = a0;
                super(1);
            }

            public final void a(com.dcinside.app.model.f0 f00) {
                if(f00.f()) {
                    this.e.Z8 = true;
                    this.f.invoke();
                    return;
                }
                if(f00.e()) {
                    this.e.L9(f00.a());
                    return;
                }
                com.dcinside.app.internal.c.w(this.e, (f00.a() == null ? "" : f00.a()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.f0)object0));
                return S0.a;
            }
        }

        if(B.E.k0() != null) {
            a0.invoke();
            return;
        }
        if(this.Z8) {
            a0.invoke();
            return;
        }
        o o0 = this.a9;
        if(o0 != null) {
            o0.l();
        }
        this.a9 = uk.Rj(this.D6()).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.H.setVisibility(0);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.H.setVisibility(8);
            }
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.PostWriteActivity.r(this, a0), "$tmp0");
            new com.dcinside.app.write.PostWriteActivity.r(this, a0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            com.dcinside.app.perform.e e0 = com.dcinside.app.perform.e.e.a(this);
            L.m(throwable0);
            e0.q(throwable0);
        });
    }

    private final void h7() {
        b0 b00 = null;
        if(dl.a.q2().p()) {
            int v = vk.b(this, 0x7F04012E);  // attr:colorAccent
            b0 b01 = this.x;
            if(b01 == null) {
                L.S("binding");
                b01 = null;
            }
            b01.F.setAlpha(0.8f);
            b0 b02 = this.x;
            if(b02 == null) {
                L.S("binding");
                b02 = null;
            }
            b02.F.setTextColor(v);
            b0 b03 = this.x;
            if(b03 == null) {
                L.S("binding");
                b03 = null;
            }
            Drawable[] arr_drawable = b03.F.getCompoundDrawables();
            L.m(arr_drawable);
            for(int v1 = 0; v1 < arr_drawable.length; ++v1) {
                Drawable drawable0 = arr_drawable[v1];
                if(drawable0 != null) {
                    drawable0.setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.SRC_IN));
                }
            }
            b0 b04 = this.x;
            if(b04 == null) {
                L.S("binding");
                b04 = null;
            }
            b04.z0.setTextColor(-1);
        }
        int v2 = dl.a.q2().m() ? Color.argb(200, 0, 0, 0) : Color.argb(200, 0xFF, 0xFF, 0xFF);
        b0 b05 = this.x;
        if(b05 == null) {
            L.S("binding");
        }
        else {
            b00 = b05;
        }
        b00.o.setBackgroundColor(v2);
    }

    private final void h8() {
        if(this.L.N()) {
            com.dcinside.app.internal.c.v(this, 0x7F150795);  // string:poll_create_only_one "투표는 하나만 등록 가능합니다."
            return;
        }
        GalleryInfo galleryInfo0 = this.z;
        if(galleryInfo0 == null) {
            boolean z = this.getIntent().getBooleanExtra("com.dcinside.app.extra.EXTRA_POST_WRITE_GALLERY_PRIVATE", false);
            boolean z1 = this.getIntent().getBooleanExtra("com.dcinside.app.extra.EXTRA_POST_WRITE_GALLERY_MEMBERSHIP", false);
            GalleryInfo galleryInfo1 = new GalleryInfo(0, null, 0, 0L, false, 0, null, false, false, 0, false, 0, null, null, null, null, false, null, null, null, null, false, 0, 0, false, 0, false, null, 0, null, null, null, null, null, false, false, false, null, false, null, false, false, null, null, false, null, null, null, null, null, -1, 0x3FFFF, null);
            galleryInfo1.x0((this.A == null ? null : this.A.J()));
            galleryInfo1.M0((this.A == null ? 0L : this.A.S()));
            galleryInfo1.W0(z);
            galleryInfo1.U0(z1);
            galleryInfo0 = galleryInfo1;
        }
        PostPollSettingActivity.G.a(this, galleryInfo0);
    }

    // 检测为 Lambda 实现
    private static final void h9(PostWriteActivity postWriteActivity0, f f0, int v, boolean z, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void i6(PostWriteActivity postWriteActivity0) [...]

    private final void i7(Intent intent0) {
        static final class l0 extends N implements Function1 {
            final PostWriteActivity e;

            l0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void b(@m View view0) {
                this.e.E8(view0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((View)object0));
                return S0.a;
            }
        }

        Object object0 = IntentCompat.d(intent0, "com.dcinside.app.extra.EXTRA_POST_WRITE_MENU_VISIBLE", MenuVisible.class);
        GalleryInfo galleryInfo0 = this.z;
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        LinearLayout linearLayout0 = b00.b0;
        L.o(linearLayout0, "postWriteMenuBar");
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
        }
        else {
            b01 = b02;
        }
        L.o(b01.e0, "postWriteMenuMore");
        l0 postWriteActivity$l00 = new l0(this);
        com.dcinside.app.write.menu.a a0 = new com.dcinside.app.write.menu.a(((MenuVisible)object0), galleryInfo0, linearLayout0, b01.e0, postWriteActivity$l00);
        this.t9 = a0;
        a0.f();
    }

    private final void i8() {
        if(!kl.a(new o[]{this.M8})) {
            Dl.D(this, 0x7F150A18);  // string:temporary_please_wait "임시 저장 중입니다. 잠시 후 다시 시도해주세요."
            return;
        }
        String s = wk.d.d();
        if(s == null) {
            com.dcinside.app.internal.c.v(this, 0x7F1507E8);  // string:post_temp_save_fail "임시저장에 실패했습니다."
            return;
        }
        this.L.p0(new int[0]);
        this.M8 = this.n9(s, false);
    }

    private final void i9(String s, CharSequence charSequence0, int v) {
        String s7;
        if(!com.dcinside.app.write.i.a.h(s)) {
            return;
        }
        Integer integer0 = this.M6();
        String s1 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v1 = (int)integer0;
            Uri uri0 = Uri.parse((kotlin.text.v.v2(s, "http", false, 2, null) ? s : "http://" + s));
            if(uri0 != null) {
                String s2 = uri0.getHost();
                if(s2 != null) {
                    List list0 = kotlin.text.v.V4(s2, new String[]{"."}, false, 0, 6, null);
                    if(list0 != null) {
                        if(list0.size() < 2) {
                            list0 = null;
                        }
                        if(list0 != null) {
                            String s3 = (String)u.v3(list0);
                            if(s3 != null) {
                                int v2 = s3.length();
                                if(2 <= v2 && v2 < 5) {
                                    if(charSequence0 != null) {
                                        try {
                                            String s4 = charSequence0.toString();
                                            if(s4 != null) {
                                                String s5 = s4.substring(0, v);
                                                L.o(s5, "substring(...)");
                                                s1 = s5;
                                            }
                                        }
                                        catch(Exception unused_ex) {
                                        }
                                    }
                                    if(s1 == null) {
                                        return;
                                    }
                                    String s6 = s1.substring(0, kotlin.text.v.s3(s1, s, 0, false, 6, null));
                                    L.o(s6, "substring(...)");
                                    com.dcinside.app.realm.k0.a k0$a0 = k0.r;
                                    k0 k00 = k0$a0.i(s);
                                    if(s6.length() == 0) {
                                        s7 = "";
                                    }
                                    else {
                                        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(s6);
                                        s7 = com.dcinside.rich.html.a.a.h(spannableStringBuilder0, 1);
                                    }
                                    k0 k01 = k0$a0.o(s7 + "<ignore>" + s + "</ignore>");
                                    this.L.E();
                                    this.L.S().add(v1, k00);
                                    this.L.S().add(v1, k01);
                                    this.k9 = v;
                                    this.L.notifyItemRangeInserted(v1, 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void j5(String s, String s1, String s2, boolean z) {
        ArrayList arrayList0 = this.L.S();
        int v = this.M6();
        int v1 = v < 0 ? arrayList0.size() : v + 1;
        arrayList0.add(v1, k0.r.m(s));
        this.L.notifyItemInserted(v1);
        b0 b00 = this.x;
        f f0 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.w0.scrollToPosition(v1);
        try {
            f0 = (f)uk.a.r(s, f.class);
        }
        catch(Exception unused_ex) {
        }
        if(f0 == null) {
            return;
        }
        this.j9(f0);
        if(!dl.a.I2() && z) {
            this.G9(s1, s2);
        }
    }

    // 检测为 Lambda 实现
    private static final void j6(PostWriteActivity postWriteActivity0) [...]

    private final void j7(boolean z) {
        String s;
        b0 b00 = null;
        if(!z) {
            b0 b01 = this.x;
            if(b01 == null) {
                L.S("binding");
            }
            else {
                b00 = b01;
            }
            b00.Q.setVisibility(8);
            this.P.u(false);
            return;
        }
        B b0 = this.U8;
        if(b0 == null) {
            s = "guest";
        }
        else {
            s = b0.r6();
            if(s == null) {
                s = "guest";
            }
        }
        String s1 = dl.a.Q1(s);
        if(s1 != null && s1.length() != 0) {
            List list0 = kotlin.text.v.V4(s1, new String[]{"#"}, false, 0, 6, null);
            this.P.u(true);
            g4 g40 = this.V9;
            if(g40 != null) {
                if(g40 == null) {
                    L.S("dcconRecentTagBinding");
                }
                else {
                    b00 = g40;
                }
                ConstraintLayout constraintLayout0 = ((g4)b00).b();
                L.o(constraintLayout0, "getRoot(...)");
                constraintLayout0.setVisibility(0);
                this.M.w(list0);
                return;
            }
            b0 b02 = this.x;
            if(b02 == null) {
                L.S("binding");
                b02 = null;
            }
            com.dcinside.app.write.Q q0 = (ViewStub viewStub0, View view0) -> {
                L.p(this, "this$0");
                L.p(list0, "$tagList");
                g4 g40 = g4.a(view0);
                L.o(g40, "bind(...)");
                this.V9 = g40;
                g4 g41 = null;
                if(g40 == null) {
                    L.S("dcconRecentTagBinding");
                    g40 = null;
                }
                Context context0 = g40.b().getContext();
                g4 g42 = this.V9;
                if(g42 == null) {
                    L.S("dcconRecentTagBinding");
                    g42 = null;
                }
                LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(context0, 0, false);
                g42.d.setLayoutManager(linearLayoutManager0);
                g4 g43 = this.V9;
                if(g43 == null) {
                    L.S("dcconRecentTagBinding");
                    g43 = null;
                }
                g43.d.setAdapter(this.M);
                g4 g44 = this.V9;
                if(g44 == null) {
                    L.S("dcconRecentTagBinding");
                }
                else {
                    g41 = g44;
                }
                com.dcinside.app.write.o0 o00 = (View view0, int v) -> {
                    L.p(postWriteActivity0, "this$0");
                    return postWriteActivity0.q8(v);
                };
                com.dcinside.app.util.ql.b.e(g41.d, o00);
                this.M.w(list0);
            };
            b02.Q.setOnInflateListener(q0);
            b0 b03 = this.x;
            if(b03 == null) {
                L.S("binding");
            }
            else {
                b00 = b03;
            }
            b00.Q.inflate();
            return;
        }
        b0 b04 = this.x;
        if(b04 == null) {
            L.S("binding");
        }
        else {
            b00 = b04;
        }
        b00.Q.setVisibility(8);
        this.P.u(false);
    }

    private final void j8() {
        SecretPostSettingActivity.w.a(this, this.o9, this.q9);
    }

    private final void j9(f f0) {
        static final class com.dcinside.app.write.PostWriteActivity.g1 extends N implements Function1 {
            final f e;
            final PostWriteActivity f;

            com.dcinside.app.write.PostWriteActivity.g1(f f0, PostWriteActivity postWriteActivity0) {
                this.e = f0;
                this.f = postWriteActivity0;
                super(1);
            }

            public final void a(AiImageStatusResult aiImageStatusResult0) {
                static final class com.dcinside.app.write.PostWriteActivity.g1.a extends N implements A3.a {
                    final PostWriteActivity e;
                    final f f;

                    com.dcinside.app.write.PostWriteActivity.g1.a(PostWriteActivity postWriteActivity0, f f0) {
                        this.e = postWriteActivity0;
                        this.f = f0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.j9(this.f);
                    }
                }

                if(L.g(aiImageStatusResult0.v(), Boolean.TRUE) && aiImageStatusResult0.u() > 0) {
                    String s = this.e.e();
                    if(s != null && s.length() > 0) {
                        this.f.N5(this.e, aiImageStatusResult0.u());
                        return;
                    }
                    PostWriteActivity.d9(this.f, this.e, aiImageStatusResult0.u(), false, 4, null);
                    return;
                }
                this.f.v8(aiImageStatusResult0.u() == 0, new com.dcinside.app.write.PostWriteActivity.g1.a(this.f, this.e));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((AiImageStatusResult)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.write.PostWriteActivity.h1 extends N implements A3.a {
            final PostWriteActivity e;
            final f f;

            com.dcinside.app.write.PostWriteActivity.h1(PostWriteActivity postWriteActivity0, f f0) {
                this.e = postWriteActivity0;
                this.f = f0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.j9(this.f);
            }
        }

        this.v9 = uk.wk(true).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.PostWriteActivity.g1(f0, this), "$tmp0");
            new com.dcinside.app.write.PostWriteActivity.g1(f0, this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(f0, "$args");
            this.v8(false, new com.dcinside.app.write.PostWriteActivity.h1(this, f0));
        });
    }

    static void k5(PostWriteActivity postWriteActivity0, String s, String s1, String s2, boolean z, int v, Object object0) {
        if((v & 8) != 0) {
            z = false;
        }
        postWriteActivity0.j5(s, s1, s2, z);
    }

    // 检测为 Lambda 实现
    private static final void k6(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void k7(PostWriteActivity postWriteActivity0, List list0, ViewStub viewStub0, View view0) [...]

    private final void k8() {
        if(this.L.T() >= 5) {
            String s = this.getString(0x7F15093E, new Object[]{5});  // string:series_append_write_limit "시리즈는 %d개까지 등록 가능합니다."
            L.o(s, "getString(...)");
            com.dcinside.app.internal.c.w(this, s);
            return;
        }
        SeriesListActivity.F.a(this, this.z9);
    }

    // 检测为 Lambda 实现
    private static final void k9(Function1 function10, Object object0) [...]

    private final void l5(Intent intent0, boolean z) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$addAiImageToAdapter$1", f = "PostWriteActivity.kt", i = {}, l = {0xAB7}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.e extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final Intent l;
            final PostWriteActivity m;
            final boolean n;

            com.dcinside.app.write.PostWriteActivity.e(Intent intent0, PostWriteActivity postWriteActivity0, boolean z, kotlin.coroutines.d d0) {
                this.l = intent0;
                this.m = postWriteActivity0;
                this.n = z;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.e(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.write.PostWriteActivity.e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$addAiImageToAdapter$1$1", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nPostWriteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$addAiImageToAdapter$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4099:1\n257#2,2:4100\n1#3:4102\n*S KotlinDebug\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$addAiImageToAdapter$1$1\n*L\n2754#1:4100,2\n*E\n"})
                static final class com.dcinside.app.write.PostWriteActivity.e.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final PostWriteActivity l;
                    final String m;
                    final String n;
                    final boolean o;

                    com.dcinside.app.write.PostWriteActivity.e.a(PostWriteActivity postWriteActivity0, String s, String s1, boolean z, kotlin.coroutines.d d0) {
                        this.l = postWriteActivity0;
                        this.m = s;
                        this.n = s1;
                        this.o = z;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.write.PostWriteActivity.e.a(this.l, this.m, this.n, this.o, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.write.PostWriteActivity.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        ArrayList arrayList0 = this.l.L.S();
                        int v = this.l.M6();
                        int v1 = v < 0 ? arrayList0.size() : v + 1;
                        arrayList0.add(v1, com.dcinside.app.realm.k0.a.b(k0.r, this.m, false, null, this.n, false, this.o, 20, null));
                        this.l.L.r0(false);
                        this.l.L.notifyItemInserted(v1);
                        this.l.L.p0(new int[0]);
                        b0 b00 = this.l.x;
                        if(b00 == null) {
                            L.S("binding");
                            b00 = null;
                        }
                        b00.w0.scrollToPosition(v1);
                        if(this.o) {
                            b0 b01 = this.l.x;
                            if(b01 == null) {
                                L.S("binding");
                                b01 = null;
                            }
                            L.o(b01.z, "postWriteAiEasyWrap");
                            b01.z.setVisibility(8);
                            this.l.Q6();
                            b0 b02 = this.l.x;
                            if(b02 == null) {
                                L.S("binding");
                                b02 = null;
                            }
                            Editable editable0 = b02.n.getText();
                            if(editable0 != null) {
                                editable0.clear();
                            }
                            AiImageStatusResult aiImageStatusResult0 = this.l.I9;
                            if(aiImageStatusResult0 != null) {
                                List list0 = aiImageStatusResult0.r();
                                if(list0 != null) {
                                    Integer integer0 = kotlin.coroutines.jvm.internal.b.f(u.d3(list0, this.l.J9));
                                    if(integer0.intValue() < 0) {
                                        integer0 = null;
                                    }
                                    if(integer0 != null) {
                                        dl.a.h3(integer0.intValue());
                                    }
                                }
                            }
                        }
                        this.l.J9 = null;
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        String s = this.l.getStringExtra("EXTRA_AI_IMAGE_RESULT_DATA");
                        String s1 = this.l.getStringExtra("EXTRA_AI_IMAGE_RESAMPLE_IMAGE");
                        com.dcinside.app.write.PostWriteActivity.e.a postWriteActivity$e$a0 = new com.dcinside.app.write.PostWriteActivity.e.a(this.m, (s == null ? "" : s), (s1 == null ? "" : s1), this.n, null);
                        this.k = 1;
                        return i.h(h0.e(), postWriteActivity$e$a0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.write.PostWriteActivity.e(intent0, this, z, null), 2, null);
    }

    // 检测为 Lambda 实现
    private static final void l6(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final boolean l7(PostWriteActivity postWriteActivity0, View view0, int v) [...]

    private final void l8() {
        this.P.j();
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.P.setVisibility(8);
    }

    // 检测为 Lambda 实现
    private static final void l9(PostWriteActivity postWriteActivity0, f f0, Throwable throwable0) [...]

    private final Object m5(Collection collection0, int v, boolean z, String s, boolean z1, boolean z2, int v1, kotlin.coroutines.d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity", f = "PostWriteActivity.kt", i = {0, 0, 0}, l = {0xA54, 0xA66}, m = "addImagesToAdapter", n = {"this", "job", "isAutoSave"}, s = {"L$0", "L$1", "Z$0"})
        static final class com.dcinside.app.write.PostWriteActivity.f extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            boolean m;
            Object n;
            final PostWriteActivity o;
            int p;

            com.dcinside.app.write.PostWriteActivity.f(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.o = postWriteActivity0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.p |= 0x80000000;
                return this.o.m5(null, 0, false, null, false, false, 0, this);
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$addImagesToAdapter$2", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.g extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final boolean l;
            final PostWriteActivity m;

            com.dcinside.app.write.PostWriteActivity.g(boolean z, PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = z;
                this.m = postWriteActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.g(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.write.PostWriteActivity.g)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                if(this.l) {
                    this.m.L.r0(false);
                }
                PostWriteActivity.t9(this.m, false, false, null, 6, null);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$addImagesToAdapter$job$1", f = "PostWriteActivity.kt", i = {}, l = {0xA4D, 0xA4E}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final PostWriteActivity l;

            h(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new h(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((h)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$addImagesToAdapter$job$1$1", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.write.PostWriteActivity.h.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final PostWriteActivity l;

                    com.dcinside.app.write.PostWriteActivity.h.a(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                        this.l = postWriteActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.write.PostWriteActivity.h.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.write.PostWriteActivity.h.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        PostWriteActivity.t9(this.l, true, false, null, 6, null);
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        if(a0.b(200L, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                com.dcinside.app.write.PostWriteActivity.h.a postWriteActivity$h$a0 = new com.dcinside.app.write.PostWriteActivity.h.a(this.l, null);
                this.k = 2;
                return i.h(h0.e(), postWriteActivity$h$a0, this) == object1 ? object1 : S0.a;
            }
        }

        kotlinx.coroutines.I0 i01;
        boolean z3;
        PostWriteActivity postWriteActivity0;
        Object object2;
        com.dcinside.app.write.PostWriteActivity.f postWriteActivity$f0;
        if(d0 instanceof com.dcinside.app.write.PostWriteActivity.f) {
            postWriteActivity$f0 = (com.dcinside.app.write.PostWriteActivity.f)d0;
            int v2 = postWriteActivity$f0.p;
            if((v2 & 0x80000000) == 0) {
                postWriteActivity$f0 = new com.dcinside.app.write.PostWriteActivity.f(this, d0);
            }
            else {
                postWriteActivity$f0.p = v2 ^ 0x80000000;
            }
        }
        else {
            postWriteActivity$f0 = new com.dcinside.app.write.PostWriteActivity.f(this, d0);
        }
        Object object0 = postWriteActivity$f0.n;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(postWriteActivity$f0.p) {
            case 0: {
                f0.n(object0);
                kotlinx.coroutines.I0 i00 = kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new h(this, null), 2, null);
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                L.o(b00.w0, "postWriteRecycler");
                long v3 = this.F6();
                long v4 = this.E6();
                postWriteActivity$f0.k = this;
                postWriteActivity$f0.l = i00;
                postWriteActivity$f0.m = z1;
                postWriteActivity$f0.p = 1;
                object2 = object1;
                if(com.dcinside.app.write.d.a.a(this, collection0, b00.w0, v, v3, v4, z, s, z2, v1, postWriteActivity$f0) == object2) {
                    return object2;
                }
                postWriteActivity0 = this;
                z3 = z1;
                i01 = i00;
                break;
            }
            case 1: {
                z3 = postWriteActivity$f0.m;
                i01 = (kotlinx.coroutines.I0)postWriteActivity$f0.l;
                postWriteActivity0 = (PostWriteActivity)postWriteActivity$f0.k;
                f0.n(object0);
                object2 = object1;
                break;
            }
            case 2: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(z3) {
            postWriteActivity0.v6();
        }
        kotlinx.coroutines.I0.a.b(i01, null, 1, null);
        com.dcinside.app.write.PostWriteActivity.g postWriteActivity$g0 = new com.dcinside.app.write.PostWriteActivity.g(z3, postWriteActivity0, null);
        postWriteActivity$f0.k = null;
        postWriteActivity$f0.l = null;
        postWriteActivity$f0.p = 2;
        return i.h(h0.e(), postWriteActivity$g0, postWriteActivity$f0) == object2 ? object2 : S0.a;
    }

    public final void m6() {
        this.L.s0();
    }

    private final boolean m7() {
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.p0, "postWriteProgress");
        return b00.p0.getVisibility() == 0;
    }

    private final void m8() {
        if(((long)this.L.O()) >= this.F6()) {
            String s = this.getString(0x7F1507FE, new Object[]{this.F6()});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
            L.o(s, "getString(...)");
            Dl.G(this, s);
            return;
        }
        if(cl.i(this, this)) {
            this.D = 102;
            return;
        }
        Intent intent0 = new Intent();
        intent0.setType("image/*");
        intent0.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent0.setAction("android.intent.action.GET_CONTENT");
        L.o("사진을 가져올 때 사용할 앱을 선택해주세요.", "getString(...)");
        Intent intent1 = Intent.createChooser(intent0, "사진을 가져올 때 사용할 앱을 선택해주세요.");
        L.o(intent1, "createChooser(...)");
        this.startActivityForResult(intent1, 1009);
    }

    public final void m9() {
        if(this.s1()) {
            return;
        }
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.N.requestFocus();
    }

    public static void n2(Throwable throwable0) {
    }

    static Object n5(PostWriteActivity postWriteActivity0, Collection collection0, int v, boolean z, String s, boolean z1, boolean z2, int v1, kotlin.coroutines.d d0, int v2, Object object0) {
        String s1 = (v2 & 8) == 0 ? s : "";
        boolean z3 = (v2 & 16) == 0 ? z1 : true;
        boolean z4 = (v2 & 0x20) == 0 ? z2 : false;
        return (v2 & 0x40) == 0 ? postWriteActivity0.m5(collection0, v, z, s1, z3, z4, v1, d0) : postWriteActivity0.m5(collection0, v, z, s1, z3, z4, 0, d0);
    }

    private final void n6() {
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.z, "postWriteAiEasyWrap");
        b00.z.setVisibility(8);
        com.dcinside.app.util.Nk.a nk$a0 = Nk.a;
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
        }
        else {
            b01 = b02;
        }
        nk$a0.c(b01.z);
        this.Q6();
    }

    private final boolean n7() {
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.z, "postWriteAiEasyWrap");
        return b00.z.getVisibility() == 0;
    }

    private final void n8() {
        if(((long)this.L.O()) >= this.F6()) {
            String s = this.getString(0x7F1507FE, new Object[]{this.F6()});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
            L.o(s, "getString(...)");
            Dl.G(this, s);
            return;
        }
        if(cl.i(this, this)) {
            this.D = 103;
            return;
        }
        int v = (int)(this.F6() - ((long)this.L.O()));
        com.dcinside.app.album.h.c(this).b(this.E6()).f(v).e("이미지를 선택해주세요.").c(1010).d(this.K6()).a();
    }

    private final o n9(String s, boolean z) {
        static final class i1 extends N implements Function1 {
            final PostWriteActivity e;
            final boolean f;
            final boolean g;

            i1(PostWriteActivity postWriteActivity0, boolean z, boolean z1) {
                this.e = postWriteActivity0;
                this.f = z;
                this.g = z1;
                super(1);
            }

            public final void b(List list0) {
                F0 f00 = this.e.F1();
                if(f00 == null) {
                    return;
                }
                f00.Y3((F0 f00) -> {
                    L.p(this.e, "this$0");
                    L.p(f00, "r");
                    io.realm.T0 t00 = new io.realm.T0();
                    t00.addAll(list0);
                    b0 b00 = null;
                    Class class0 = j0.class;
                    if(this.f) {
                        j0 j00 = (j0)f00.C4(class0).g0("time", this.e.l9).r0();
                        if(j00 != null) {
                            List list1 = u.k(j00);
                            j0.h.b(f00, list1);
                        }
                        this.e.l9 = System.currentTimeMillis();
                        j0 j01 = new j0();
                        j01.X5(this.e.l9);
                        b0 b01 = this.e.x;
                        if(b01 == null) {
                            L.S("binding");
                        }
                        else {
                            b00 = b01;
                        }
                        j01.V5(String.valueOf(b00.y0.getText()));
                        j01.U5(t00);
                        j01.W5(1L);
                        f00.o2(j01, new io.realm.W[0]);
                    }
                    else {
                        j0 j02 = new j0();
                        j02.X5(System.currentTimeMillis());
                        b0 b02 = this.e.x;
                        if(b02 == null) {
                            L.S("binding");
                        }
                        else {
                            b00 = b02;
                        }
                        j02.V5(String.valueOf(b00.y0.getText()));
                        j02.U5(t00);
                        j02.W5(0L);
                        f00.o2(j02, new io.realm.W[0]);
                    }
                    if(f00.C4(class0).N() > ((long)jl.a.L0())) {
                        j0 j03 = (j0)f00.C4(class0).g2("time", r1.b).r0();
                        if(j03 != null) {
                            List list2 = u.k(j03);
                            j0.h.b(f00, list2);
                        }
                    }
                });
                if(!this.f) {
                    Dl.D(this.e, (this.g ? 0x7F1507EA : 0x7F1507E9));  // string:post_temp_save_without_ai_image "작성중인 글이 임시 저장되었습니다.\n(AI 이미지는 제외)"
                    return;
                }
                if(this.g && !this.e.D9) {
                    Dl.D(this.e, 0x7F1507E3);  // string:post_temp_auto_save_include_ai_image "AI 이미지는 자동 저장되지 않습니다."
                    this.e.D9 = true;
                }
            }

            // 检测为 Lambda 实现
            private static final void c(List list0, boolean z, PostWriteActivity postWriteActivity0, F0 f00) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((List)object0));
                return S0.a;
            }
        }

        boolean z1 = false;
        ArrayList arrayList0 = this.L.S();
        if(!(arrayList0 instanceof Collection) || !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                if(k0.r.x(((k0)object0))) {
                    z1 = true;
                    break;
                }
            }
        }
        long v = this.E6();
        o o0 = com.dcinside.app.write.temp.r.a.e(this, s, arrayList0, v).A5(rx.schedulers.c.e()).M3(rx.android.schedulers.a.c()).T1(() -> {
            L.p(this, "this$0");
            o o0 = this.M8;
            if(o0 != null) {
                o0.l();
            }
        }).y5((Object object0) -> {
            L.p(new i1(this, z, z1), "$tmp0");
            new i1(this, z, z1).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            if(!z) {
                Dl.G(this, throwable0.getMessage());
            }
        });
        L.o(o0, "subscribe(...)");
        return o0;
    }

    private final void o5(String s) {
        ArrayList arrayList0 = this.L.S();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            if(((k0)object0).c6() == 7) {
                arrayList1.add(object0);
            }
        }
        if(!arrayList1.isEmpty()) {
            k0 k00 = (k0)arrayList1.get(0);
            int v = arrayList0.indexOf(k00);
            k00.p6(s);
            this.L.notifyItemChanged(v);
            return;
        }
        int v1 = this.M6();
        int v2 = v1 < 0 ? arrayList0.size() : v1 + 1;
        arrayList0.add(v2, k0.r.l(s));
        this.L.notifyItemRangeInserted(v2, 2);
        this.L.p0(new int[0]);
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.w0.scrollToPosition(v2);
    }

    public final void o6() {
        if(this.s1()) {
            return;
        }
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        AppBarLayout appBarLayout0 = b00.A;
        L.o(appBarLayout0, "postWriteAppBar");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = appBarLayout0.getLayoutParams();
        L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        Behavior appBarLayout$Behavior0 = (Behavior)((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)viewGroup$LayoutParams0).f();
        if(appBarLayout$Behavior0 == null) {
            return;
        }
        int v = appBarLayout$Behavior0.O();
        int v1 = appBarLayout0.getTotalScrollRange();
        int v2 = this.B6(appBarLayout0);
        ValueAnimator valueAnimator0 = this.K;
        if(valueAnimator0 == null) {
            valueAnimator0 = new ValueAnimator();
            valueAnimator0.setInterpolator(new DecelerateInterpolator());
            valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
                L.p(this, "this$0");
                L.p(valueAnimator0, "animation");
                Object object0 = valueAnimator0.getAnimatedValue();
                L.n(object0, "null cannot be cast to non-null type kotlin.Int");
                this.x9(((int)(((Integer)object0))));
            });
        }
        else {
            valueAnimator0.cancel();
        }
        this.K = valueAnimator0;
        valueAnimator0.setDuration(300L);
        valueAnimator0.setIntValues(new int[]{v, v2 - v1});
        valueAnimator0.start();
    }

    private final boolean o7() {
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.r, "postWriteAiEasySelect");
        return b00.r.getVisibility() == 0;
    }

    private final void o8() {
        this.J5(true);
    }

    // 检测为 Lambda 实现
    private static final void o9(PostWriteActivity postWriteActivity0) [...]

    @Override  // com.dcinside.app.base.d
    public void onActivityResult(int v, int v1, @m Intent intent0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onActivityResult$1", f = "PostWriteActivity.kt", i = {}, l = {0x96B}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.r0 extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final PostWriteActivity l;
            final ArrayList m;
            final int n;

            com.dcinside.app.write.PostWriteActivity.r0(PostWriteActivity postWriteActivity0, ArrayList arrayList0, int v, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                this.m = arrayList0;
                this.n = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.r0(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.write.PostWriteActivity.r0)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return PostWriteActivity.n5(this.l, this.m, this.n, false, null, false, false, 0, this, 120, null) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }


        static final class com.dcinside.app.write.PostWriteActivity.s0 extends N implements A3.a {
            final PostWriteActivity e;
            final String f;

            com.dcinside.app.write.PostWriteActivity.s0(PostWriteActivity postWriteActivity0, String s) {
                this.e = postWriteActivity0;
                this.f = s;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.z5(this.f);
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onActivityResult$5", f = "PostWriteActivity.kt", i = {}, l = {0x99F}, m = "invokeSuspend", n = {}, s = {})
        static final class t0 extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final PostWriteActivity l;
            final ArrayList m;

            t0(PostWriteActivity postWriteActivity0, ArrayList arrayList0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                this.m = arrayList0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new t0(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((t0)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return PostWriteActivity.n5(this.l, this.m, this.l.C, false, null, false, false, 0, this, 120, null) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }


        static final class com.dcinside.app.write.PostWriteActivity.u0 extends N implements A3.a {
            final PostWriteActivity e;
            final String f;

            com.dcinside.app.write.PostWriteActivity.u0(PostWriteActivity postWriteActivity0, String s) {
                this.e = postWriteActivity0;
                this.f = s;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.o5(this.f);
            }
        }

        String s = null;
        if(v1 == -1 && !this.s1()) {
            if(intent0 == null) {
                if(v != 1049) {
                    super.onActivityResult(v, -1, null);
                    return;
                }
                DcConPickerView dcConPickerView0 = this.P.k();
                if(dcConPickerView0 != null) {
                    dcConPickerView0.Z(1049, -1, null);
                }
            }
            else {
                switch(v) {
                    case 110: {
                        String s2 = this.B9;
                        if(s2 == null) {
                            return;
                        }
                        if(Build.VERSION.SDK_INT == 29) {
                            Uri uri0 = intent0.getData();
                            if(uri0 != null) {
                                File file0 = new File(s2);
                                ParcelFileDescriptor parcelFileDescriptor0 = this.getContentResolver().openFileDescriptor(uri0, "w");
                                if(parcelFileDescriptor0 == null) {
                                    return;
                                }
                                L.m(parcelFileDescriptor0);
                                FileInputStream fileInputStream0 = new FileInputStream(file0);
                                try {
                                    FileUtils.copy(fileInputStream0, new FileOutputStream(parcelFileDescriptor0.getFileDescriptor()));
                                }
                                catch(Throwable throwable0) {
                                    kotlin.io.c.a(fileInputStream0, throwable0);
                                    throw throwable0;
                                }
                                kotlin.io.c.a(fileInputStream0, null);
                                return;
                            }
                        }
                        break;
                    }
                    case 1009: {
                        intent0.putExtra("extra_take_image_from_android", true);
                        this.B8(intent0);
                        return;
                    }
                    case 1010: {
                        this.B8(intent0);
                        return;
                    }
                    case 0x3F6: {
                        String s1 = intent0.getStringExtra("yid");
                        if(s1 == null) {
                            return;
                        }
                        this.q6(new com.dcinside.app.write.PostWriteActivity.s0(this, s1));
                        return;
                    }
                    case 1020: {
                        com.dcinside.app.voice.m m0 = this.P.l();
                        if(m0 != null) {
                            m0.setInputText(intent0.getStringExtra("source"));
                            return;
                        }
                        break;
                    }
                    case 0x401: {
                        if(this.C >= 0) {
                            String s3 = Gk.r(intent0.getData());
                            if(s3 == null) {
                                return;
                            }
                            ArrayList arrayList1 = u.s(new String[]{s3});
                            this.L.q(this.C);
                            kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new t0(this, arrayList1, null), 2, null);
                            return;
                        }
                        break;
                    }
                    case 0x402: {
                        b0 b00 = this.x;
                        if(b00 == null) {
                            L.S("binding");
                            b00 = null;
                        }
                        L.o(b00.w0, "postWriteRecycler");
                        int v2 = O2.e(b00.w0);
                        ArrayList arrayList2 = intent0.getStringArrayListExtra("intent_path");
                        if(arrayList2 == null) {
                            return;
                        }
                        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.write.PostWriteActivity.r0(this, arrayList2, v2, null), 2, null);
                        if(Build.VERSION.SDK_INT == 29) {
                            if(!arrayList2.isEmpty()) {
                                s = arrayList2;
                            }
                            if(s != null) {
                                String s4 = (String)((ArrayList)s).get(0);
                                if(s4 != null) {
                                    this.B9 = s4;
                                    Dl.D(this, 0x7F150931);  // string:select_folder_save_file "저장할 위치를 선택해주세요"
                                    String s5 = new File(s4).getName();
                                    Intent intent1 = new Intent("android.intent.action.CREATE_DOCUMENT");
                                    intent1.addCategory("android.intent.category.OPENABLE");
                                    intent1.setType("image/gif");
                                    intent1.putExtra("android.intent.extra.TITLE", s5);
                                    intent1.putExtra("android.provider.extra.INITIAL_URI", Gk.v(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)));
                                    this.startActivityForResult(intent1, 110);
                                    return;
                                }
                            }
                            return;
                        }
                        break;
                    }
                    case 1040: {
                        this.r7(false);
                        return;
                    }
                    case 1041: {
                        if(intent0.getBooleanExtra("com.dcinside.app.EXTRA_SECRET_CLEAR", false)) {
                            this.A9(null);
                            this.w9(false);
                            return;
                        }
                        this.A9(intent0.getStringExtra("com.dcinside.app.EXTRA_SECRET_PASSWORD"));
                        return;
                    }
                    case 1042: {
                        if(!intent0.getBooleanExtra("com.dcinside.app.EXTRA_CLEAR_DATE", false)) {
                            s = intent0.getStringExtra("com.dcinside.app.EXTRA_REMOVE_DATE");
                        }
                        this.u9(s);
                        return;
                    }
                    case 1043: {
                        this.q6(new com.dcinside.app.write.PostWriteActivity.u0(this, intent0.getStringExtra("com.dcinside.app.EXTRA_POLL_SETTING_DATA")));
                        return;
                    }
                    case 1044: {
                        this.A9(intent0.getStringExtra("com.dcinside.app.EXTRA_SECRET_PASSWORD"));
                        this.w9(intent0.getBooleanExtra("com.dcinside.app.EXTRA_HAS_SECRET", false));
                        this.u9(intent0.getStringExtra("com.dcinside.app.EXTRA_REMOVE_DATE"));
                        this.z9(intent0.getBooleanExtra("com.dcinside.app.EXTRA_ENABLE_FIX", false));
                        return;
                    }
                    case 1046: {
                        ArrayList arrayList0 = intent0.getStringArrayListExtra("intent_path");
                        if(arrayList0 == null) {
                            return;
                        }
                        this.S9(arrayList0);
                        return;
                    }
                    case 1049: {
                        DcConPickerView dcConPickerView1 = this.P.k();
                        if(dcConPickerView1 != null) {
                            dcConPickerView1.Z(1049, -1, intent0);
                            return;
                        }
                        break;
                    }
                    default: {
                        super.onActivityResult(v, -1, intent0);
                    }
                }
            }
        }
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        static final class com.dcinside.app.write.PostWriteActivity.v0 extends N implements Function1 {
            public static final com.dcinside.app.write.PostWriteActivity.v0 e;

            static {
                com.dcinside.app.write.PostWriteActivity.v0.e = new com.dcinside.app.write.PostWriteActivity.v0();
            }

            com.dcinside.app.write.PostWriteActivity.v0() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15035B);  // string:finish_confirm "\"확인\"을 누르면 이전 화면으로 돌아갑니다. 작성 중인 글은 저장되지 않습니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.PostWriteActivity.w0 extends N implements Function1 {
            public static final com.dcinside.app.write.PostWriteActivity.w0 e;

            static {
                com.dcinside.app.write.PostWriteActivity.w0.e = new com.dcinside.app.write.PostWriteActivity.w0();
            }

            com.dcinside.app.write.PostWriteActivity.w0() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class x0 extends N implements Function1 {
            final PostWriteActivity e;

            x0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.finish();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        b0 b00 = null;
        if(this.L.g()) {
            return;
        }
        if(this.P.m()) {
            b0 b01 = this.x;
            if(b01 == null) {
                L.S("binding");
            }
            else {
                b00 = b01;
            }
            b00.P.setVisibility(8);
            this.P.n();
            return;
        }
        if(this.n7()) {
            this.n6();
            return;
        }
        m0.a.a a$a0 = m0.a.a;
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
        }
        else {
            b00 = b02;
        }
        if(!a$a0.k(String.valueOf(b00.y0.getText())) && this.L.W()) {
            this.finish();
            return;
        }
        com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.write.PostWriteActivity.v0.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(com.dcinside.app.write.PostWriteActivity.w0.e, "$tmp0");
            return (Boolean)com.dcinside.app.write.PostWriteActivity.w0.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new x0(this), "$tmp0");
            new x0(this).invoke(object0);
        });
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void onConfigurationChanged(@l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        if(configuration0.orientation == 1 || configuration0.orientation == 2) {
            this.r7(true);
        }
    }

    @Override  // com.dcinside.app.write.B1
    protected void onCreate(@m Bundle bundle0) {
        static final class H0 extends N implements A3.a {
            final PostWriteActivity e;

            H0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.O8();
            }
        }

        View view1;
        View view0;
        super.onCreate(bundle0);
        b0 b00 = b0.c(this.getLayoutInflater());
        L.o(b00, "inflate(...)");
        this.x = b00;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        this.setContentView(b00.b());
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
            b02 = null;
        }
        this.S0(b02.C0);
        kr.bhbfhfb.designcompat.a.d(this);
        b0 b03 = this.x;
        if(b03 == null) {
            L.S("binding");
            b03 = null;
        }
        RichToolbar richToolbar0 = b03.A0;
        richToolbar0.setSelector(vk.f(this, 0x7F04035C));  // attr:itemSelector
        b0 b04 = this.x;
        if(b04 == null) {
            L.S("binding");
            b04 = null;
        }
        richToolbar0.setColorPalette(b04.B0);
        richToolbar0.setOnClickClose(new H0(this));
        b0 b05 = this.x;
        if(b05 == null) {
            L.S("binding");
            b05 = null;
        }
        Spanned spanned0 = Dl.c("<u>취소하기</u>");
        b05.s0.setText(spanned0);
        b0 b06 = this.x;
        if(b06 == null) {
            L.S("binding");
            b06 = null;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        b06.w0.setLayoutManager(nonPredictiveLayoutManager0);
        ItemTouchHelper itemTouchHelper0 = new ItemTouchHelper(new Z.c(this.L, false, 2, null));
        b0 b07 = this.x;
        if(b07 == null) {
            L.S("binding");
            b07 = null;
        }
        itemTouchHelper0.m(b07.w0);
        this.y = itemTouchHelper0;
        b0 b08 = this.x;
        if(b08 == null) {
            L.S("binding");
            b08 = null;
        }
        this.M9 = new V1(b08);
        F0 f00 = this.F1();
        if(f00 != null) {
            g1 g10 = f00.C4(j0.class).p0();
            g10.l(this.O);
            this.N = g10;
            this.J8(g10);
        }
        Intent intent0 = this.getIntent();
        if(intent0.hasExtra("com.dcinside.app.extra.MODIFY")) {
            L.m(intent0);
            this.C5(intent0);
        }
        else {
            L.m(intent0);
            this.E5(intent0);
        }
        b0 b09 = this.x;
        if(b09 == null) {
            L.S("binding");
            b09 = null;
        }
        b09.w0.setAdapter(this.L);
        this.T6();
        this.E7(this.V8, false);
        this.h7();
        com.dcinside.app.write.menu.a a0 = this.t9;
        if(a0 == null) {
            view0 = new View(this);
        }
        else {
            view0 = a0.c(com.dcinside.app.write.menu.b.k);
            if(view0 == null) {
                view0 = new View(this);
            }
        }
        com.dcinside.app.write.menu.a a1 = this.t9;
        if(a1 == null) {
            view1 = new View(this);
        }
        else {
            view1 = a1.c(com.dcinside.app.write.menu.b.m);
            if(view1 == null) {
                view1 = new View(this);
            }
        }
        h1 h10 = this.P;
        b0 b010 = this.x;
        if(b010 == null) {
            L.S("binding");
            b010 = null;
        }
        L.o(b010.O, "postWriteDcconContainer");
        h10.h(b010.O, view0);
        h1 h11 = this.P;
        b0 b011 = this.x;
        if(b011 == null) {
            L.S("binding");
            b011 = null;
        }
        L.o(b011.J0, "postWriteVoiceContainer");
        h11.i(b011.J0, view1);
        h1 h12 = this.P;
        b0 b012 = this.x;
        if(b012 == null) {
            L.S("binding");
        }
        else {
            b01 = b012;
        }
        h12.s(b01.B);
        this.D5();
    }

    @Override  // com.dcinside.app.write.B1
    protected void onDestroy() {
        Fk.a.a();
        try {
            this.L.onDestroy();
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
        }
        g1 g10 = this.V8;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        g1 g11 = this.N;
        if(g11 != null) {
            if(!g11.s()) {
                g11 = null;
            }
            if(g11 != null) {
                g11.D();
            }
        }
        this.V8 = null;
        this.N = null;
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.n0.removeTextChangedListener(this.i9);
        V1 v10 = this.M9;
        if(v10 == null) {
            L.S("postWriteGuideManager");
            v10 = null;
        }
        v10.b();
        ValueAnimator valueAnimator0 = this.K;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        p p0 = this.Y;
        if(p0 != null) {
            p0.e();
        }
        this.Y = null;
        this.X.removeCallbacksAndMessages(null);
        kl.b(new o[]{this.O8, this.Z, this.M8, this.N8, this.S8, this.r9, this.Y8, this.a9, this.Q8, this.c9, this.f9, this.u9, this.v9, this.P8, this.w9, this.H9, this.E9, this.b9});
        this.T8.clear();
        this.P.r();
        e e0 = this.Q;
        if(e0 != null) {
            e0.p();
        }
        this.Q = null;
        g g0 = this.R8;
        if(g0 != null) {
            try {
                g0.dismissAllowingStateLoss();
            }
            catch(Exception unused_ex) {
            }
        }
        this.R8 = null;
        super.onDestroy();
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public boolean onDown(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "e");
        return false;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public boolean onFling(@m MotionEvent motionEvent0, @l MotionEvent motionEvent1, float f, float f1) {
        L.p(motionEvent1, "e2");
        if(f1 > 0.0f && Math.abs(f1) > 15.0f) {
            this.n6();
            return true;
        }
        return false;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public void onLongPress(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "e");
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onPause() {
        this.r6();
        super.onPause();
        try {
            this.L.onPause();
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@m PermissionDeniedResponse permissionDeniedResponse0) {
        Dl.D(this, cl.b((permissionDeniedResponse0 == null ? null : permissionDeniedResponse0.getPermissionName())));
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@m PermissionGrantedResponse permissionGrantedResponse0) {
        Dl.D(this, cl.c((permissionGrantedResponse0 == null ? null : permissionGrantedResponse0.getPermissionName())));
        switch(this.D) {
            case 102: {
                this.m8();
                return;
            }
            case 103: {
                this.n8();
                return;
            }
            case 0x72: {
                this.d8();
                return;
            }
            case 0x76: {
                this.p8();
                return;
            }
            case 0x77: {
                this.R9();
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l PermissionRequest permissionRequest0, @m PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onResume() {
        this.s6();
        super.onResume();
        try {
            this.L.onResume();
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public boolean onScroll(@m MotionEvent motionEvent0, @l MotionEvent motionEvent1, float f, float f1) {
        L.p(motionEvent1, "e2");
        return false;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public void onShowPress(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "e");
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public boolean onSingleTapUp(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "e");
        return false;
    }

    @Override  // com.dcinside.app.base.d
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if(z) {
            b0 b00 = this.x;
            if(b00 == null) {
                L.S("binding");
                b00 = null;
            }
            if(b00.n.isFocused()) {
                this.M5();
            }
        }
    }

    private final void p5(String s, String s1) {
        k0 k00;
        ArrayList arrayList0 = this.L.S();
        int v = this.C9;
        b0 b00 = null;
        if(v >= 0) {
            try {
                k00 = null;
                k00 = (k0)arrayList0.get(v);
            }
            catch(Exception unused_ex) {
            }
            if(k00 != null) {
                k00.p6(s);
                k00.i6(s1);
                this.L.notifyItemChanged(this.C9);
                this.C9 = -1;
                return;
            }
        }
        int v1 = this.M6();
        int v2 = v1 < 0 ? arrayList0.size() : v1 + 1;
        this.L.r0(false);
        arrayList0.add(v2, k0.r.n(s, s1));
        this.L.notifyItemInserted(v2);
        this.L.p0(new int[0]);
        b0 b01 = this.x;
        if(b01 == null) {
            L.S("binding");
        }
        else {
            b00 = b01;
        }
        b00.w0.scrollToPosition(v2);
    }

    // 检测为 Lambda 实现
    private static final void p6(PostWriteActivity postWriteActivity0, ValueAnimator valueAnimator0) [...]

    private final boolean p7() {
        if(!this.T8.isEmpty()) {
            ArrayList arrayList0 = this.T8;
            if(!(arrayList0 instanceof Collection) || !arrayList0.isEmpty()) {
                for(Object object0: arrayList0) {
                    if(((o)object0) != null && !((o)object0).j()) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return true;
    }

    private final void p8() {
        long v = (long)this.L.U();
        jl jl0 = jl.a;
        if(v >= jl0.q0()) {
            String s = this.getString(0x7F150811, new Object[]{jl0.q0()});  // string:post_write_video_count_limit "동영상은 최대 %d개까지만 첨부 가능합니다."
            L.o(s, "getString(...)");
            com.dcinside.app.internal.c.w(this, s);
            return;
        }
        if(cl.i(this, this)) {
            this.D = 0x76;
            return;
        }
        Intent intent0 = new Intent(this, AlbumActivity.class);
        intent0.putExtra("extra_upload_video", true);
        this.startActivityForResult(intent0, 1046);
    }

    // 检测为 Lambda 实现
    private static final void p9(Function1 function10, Object object0) [...]

    private final void q5(VideoInfoData videoInfoData0) {
        int v1;
        String s = videoInfoData0.v();
        if(s == null) {
            return;
        }
        ArrayList arrayList0 = this.L.S();
        int v = this.E;
        if(v >= 0) {
            v1 = v - 1;
            this.L.q(v);
            this.E = -1;
        }
        else {
            v1 = this.M6();
        }
        int v2 = v1 < 0 ? arrayList0.size() : v1 + 1;
        arrayList0.add(v2, k0.r.s(s, videoInfoData0));
        this.L.r0(false);
        this.L.notifyItemInserted(v2);
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.w0.scrollToPosition(v2);
        this.L.p0(new int[0]);
    }

    private final void q6(A3.a a0) {
        this.r6();
        a0.invoke();
        this.v6();
        this.s6();
    }

    private final boolean q7() {
        return ((Boolean)this.F.getValue()).booleanValue();
    }

    private final boolean q8(int v) {
        int v1 = this.M6();
        b0 b00 = this.x;
        Adapter recyclerView$Adapter0 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        ViewHolder recyclerView$ViewHolder0 = b00.w0.findViewHolderForAdapterPosition(v1);
        if(recyclerView$ViewHolder0 instanceof y2) {
            g4 g40 = this.V9;
            if(g40 == null) {
                L.S("dcconRecentTagBinding");
                g40 = null;
            }
            L.o(g40.d, "dcconRecentTagView");
            Adapter recyclerView$Adapter1 = g40.d.getAdapter();
            if(recyclerView$Adapter1 instanceof com.dcinside.app.dccon.c) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((com.dcinside.app.dccon.c)recyclerView$Adapter0) == null) {
                return false;
            }
            ((y2)recyclerView$ViewHolder0).v(((com.dcinside.app.dccon.c)recyclerView$Adapter0).v(v));
            return true;
        }
        return false;
    }

    // 检测为 Lambda 实现
    private static final void q9(boolean z, PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.base.d
    protected boolean r1() {
        return false;
    }

    private final void r5(com.dcinside.app.voice.m m0, String s, boolean z) {
        static final class com.dcinside.app.write.PostWriteActivity.i extends N implements Function1 {
            public static final com.dcinside.app.write.PostWriteActivity.i e;

            static {
                com.dcinside.app.write.PostWriteActivity.i.e = new com.dcinside.app.write.PostWriteActivity.i();
            }

            com.dcinside.app.write.PostWriteActivity.i() {
                super(1);
            }

            public final rx.g a(com.dcinside.app.model.f0 f00) {
                String s = f00.a();
                return s == null || s.length() == 0 ? rx.g.X1(new NullPointerException("voice not found")) : rx.g.Q2(s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.model.f0)object0));
            }
        }


        static final class com.dcinside.app.write.PostWriteActivity.j extends N implements Function1 {
            final PostWriteActivity e;
            final String f;

            com.dcinside.app.write.PostWriteActivity.j(PostWriteActivity postWriteActivity0, String s) {
                this.e = postWriteActivity0;
                this.f = s;
                super(1);
            }

            public final void b(@m String s) {
                static final class com.dcinside.app.write.PostWriteActivity.j.a extends N implements A3.a {
                    final PostWriteActivity e;
                    final String f;
                    final String g;

                    com.dcinside.app.write.PostWriteActivity.j.a(PostWriteActivity postWriteActivity0, String s, String s1) {
                        this.e = postWriteActivity0;
                        this.f = s;
                        this.g = s1;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.y5(this.f, this.g);
                    }
                }

                com.dcinside.app.write.PostWriteActivity.j.a postWriteActivity$j$a0 = new com.dcinside.app.write.PostWriteActivity.j.a(this.e, s, this.f);
                this.e.q6(postWriteActivity$j$a0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        String s1 = String.valueOf(b00.n0.getText());
        o o0 = this.O8;
        if(o0 != null) {
            o0.l();
        }
        this.O8 = rx.g.v1(new p0(m0, this, s1, z)).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                PostWriteActivity.t9(this, true, false, null, 6, null);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                PostWriteActivity.t9(this, false, false, null, 6, null);
            }
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.PostWriteActivity.j(this, s), "$tmp0");
            new com.dcinside.app.write.PostWriteActivity.j(this, s).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            timber.log.b.a.y(throwable0);
            com.dcinside.app.perform.e e0 = com.dcinside.app.perform.e.e.a(this);
            L.m(throwable0);
            e0.q(throwable0);
        });
    }

    private final void r6() {
        o o0 = this.c9;
        if(o0 != null) {
            o0.l();
        }
        this.c9 = null;
    }

    private final void r7(boolean z) {
        if(z) {
            b0 b00 = this.x;
            if(b00 == null) {
                L.S("binding");
                b00 = null;
            }
            b00.i0.setVisibility(8);
        }
    }

    // 检测为 Lambda 实现
    private static final void r8(PostWriteActivity postWriteActivity0) [...]

    private final void r9() {
        com.dcinside.app.util.Nk.a nk$a0 = Nk.a;
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        nk$a0.c(b00.n);
        CharaPromptSearchActivity.A.a(this, this.G9);
    }

    private static final rx.g s5(com.dcinside.app.voice.m m0, PostWriteActivity postWriteActivity0, String s, boolean z) {
        L.p(m0, "$view");
        L.p(postWriteActivity0, "this$0");
        L.p(s, "$nick");
        return m0.getInputType() == com.dcinside.app.voice.m.l.a ? uk.WG(postWriteActivity0.D6(), m0.getInputRecord(), s, z).f2((Object object0) -> {
            L.p(com.dcinside.app.write.PostWriteActivity.i.e, "$tmp0");
            return (rx.g)com.dcinside.app.write.PostWriteActivity.i.e.invoke(object0);
        }) : rx.g.Q2(m0.getInputText());
    }

    private final void s6() {
        static final class com.dcinside.app.write.PostWriteActivity.s extends N implements Function1 {
            final PostWriteActivity e;

            com.dcinside.app.write.PostWriteActivity.s(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(Long long0) {
                this.e.v6();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Long)object0));
                return S0.a;
            }
        }

        o o0 = this.c9;
        if(o0 != null) {
            o0.l();
        }
        com.dcinside.app.write.H h0 = (Object object0) -> {
            L.p(new com.dcinside.app.write.PostWriteActivity.s(this), "$tmp0");
            new com.dcinside.app.write.PostWriteActivity.s(this).invoke(object0);
        };
        com.dcinside.app.write.I i0 = (Throwable throwable0) -> timber.log.b.a.e(throwable0);
        this.c9 = this.d9.y5(h0, i0);
    }

    public final void s7(@m String s) {
        if(this.q7()) {
            P p0 = (P)uk.a.r(s, P.class);
            if(p0 == null) {
                p0 = new P(null, null, null, false, null, false, null, null, null, null, null, 0x7FF, null);
            }
            String s1 = p0.c();
            if(s1 != null) {
                Date date0 = Bk.i(s1);
                if(System.currentTimeMillis() > (date0 == null ? 0L : date0.getTime())) {
                    com.dcinside.app.internal.c.v(this, 0x7F15079C);  // string:poll_modify_imposable_finish "투표가 종료되어 수정이 불가능합니다."
                    return;
                }
            }
        }
        GalleryInfo galleryInfo0 = this.z;
        if(galleryInfo0 == null) {
            boolean z = this.getIntent().getBooleanExtra("com.dcinside.app.extra.EXTRA_POST_WRITE_GALLERY_PRIVATE", false);
            boolean z1 = this.getIntent().getBooleanExtra("com.dcinside.app.extra.EXTRA_POST_WRITE_GALLERY_MEMBERSHIP", false);
            GalleryInfo galleryInfo1 = new GalleryInfo(0, null, 0, 0L, false, 0, null, false, false, 0, false, 0, null, null, null, null, false, null, null, null, null, false, 0, 0, false, 0, false, null, 0, null, null, null, null, null, false, false, false, null, false, null, false, false, null, null, false, null, null, null, null, null, -1, 0x3FFFF, null);
            galleryInfo1.x0((this.A == null ? null : this.A.J()));
            galleryInfo1.M0((this.A == null ? 0L : this.A.S()));
            galleryInfo1.W0(z);
            galleryInfo1.U0(z1);
            galleryInfo0 = galleryInfo1;
        }
        boolean z2 = this.q7();
        PostPollSettingActivity.G.b(this, galleryInfo0, s, z2);
    }

    // 检测为 Lambda 实现
    private static final Boolean s8(Function1 function10, Object object0) [...]

    private final void s9(boolean z, boolean z1, String s) {
        int v = 8;
        b0 b00 = null;
        if(z) {
            b0 b01 = this.x;
            if(b01 == null) {
                L.S("binding");
                b01 = null;
            }
            L.o(b01.p0, "postWriteProgress");
            b01.p0.setVisibility(0);
            b0 b02 = this.x;
            if(b02 == null) {
                L.S("binding");
                b02 = null;
            }
            b02.v0.setText(s);
            b0 b03 = this.x;
            if(b03 == null) {
                L.S("binding");
                b03 = null;
            }
            L.o(b03.v0, "postWriteProgressMsg");
            b03.v0.setVisibility((s == null || s.length() <= 0 ? 0 : 8));
            b0 b04 = this.x;
            if(b04 == null) {
                L.S("binding");
            }
            else {
                b00 = b04;
            }
            TextView textView0 = b00.s0;
            L.o(textView0, "postWriteProgressCancel");
            if(z1) {
                v = 0;
            }
            textView0.setVisibility(v);
            this.X.obtainMessage(0, 0, 0).sendToTarget();
            return;
        }
        b0 b05 = this.x;
        if(b05 == null) {
            L.S("binding");
            b05 = null;
        }
        L.o(b05.p0, "postWriteProgress");
        b05.p0.setVisibility(8);
        b0 b06 = this.x;
        if(b06 == null) {
            L.S("binding");
            b06 = null;
        }
        L.o(b06.v0, "postWriteProgressMsg");
        b06.v0.setVisibility(8);
        b0 b07 = this.x;
        if(b07 == null) {
            L.S("binding");
        }
        else {
            b00 = b07;
        }
        L.o(b00.s0, "postWriteProgressCancel");
        b00.s0.setVisibility(8);
    }

    // 检测为 Lambda 实现
    private static final rx.g t5(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void t6(Function1 function10, Object object0) [...]

    private final void t7(PostModify postModify0) {
        static final class com.dcinside.app.write.PostWriteActivity.p0 extends N implements A3.o {
            final PostWriteActivity e;

            com.dcinside.app.write.PostWriteActivity.p0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(2);
            }

            public final void a(@l PostHead postHead0, boolean z) {
                L.p(postHead0, "h");
                this.e.H8(postHead0, z);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PostHead)object0), ((Boolean)object1).booleanValue());
                return S0.a;
            }
        }

        PostHead postHead0;
        V1 v10 = null;
        List list0 = com.dcinside.app.realm.q.o.c((postModify0 == null ? null : postModify0.J()));
        com.dcinside.app.head.a a0 = com.dcinside.app.head.f.h.a(this, postModify0);
        if(!list0.isEmpty()) {
            a0.F(list0);
        }
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.l0, "postWriteMiniSetting");
        int v = 0;
        b00.l0.setVisibility((postModify0 == null || postModify0.K() ? 8 : 0));
        a0.E(new com.dcinside.app.write.PostWriteActivity.p0(this));
        int v1 = a0.y();
        b0 b01 = this.x;
        if(b01 == null) {
            L.S("binding");
            b01 = null;
        }
        RecyclerView recyclerView0 = b01.Y;
        L.o(recyclerView0, "postWriteHead");
        recyclerView0.setLayoutManager(new NonPredictiveLayoutManager(0, false));
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        com.dcinside.app.head.a a1 = recyclerView$Adapter0 instanceof com.dcinside.app.head.a ? ((com.dcinside.app.head.a)recyclerView$Adapter0) : null;
        if(a1 == null) {
            postHead0 = null;
        }
        else {
            if(!a1.A()) {
                a1 = null;
            }
            postHead0 = a1 == null ? null : a1.z();
        }
        if(postHead0 != null) {
            a0.I(postHead0);
        }
        recyclerView0.setAdapter(a0);
        if(!a0.A()) {
            v = 8;
        }
        recyclerView0.setVisibility(v);
        if(v1 >= 0) {
            recyclerView0.smoothScrollToPosition(v1);
        }
        V1 v11 = this.M9;
        if(v11 == null) {
            L.S("postWriteGuideManager");
        }
        else {
            v10 = v11;
        }
        v10.g();
    }

    // 检测为 Lambda 实现
    private static final void t8(Function1 function10, Object object0) [...]

    static void t9(PostWriteActivity postWriteActivity0, boolean z, boolean z1, String s, int v, Object object0) {
        if((v & 2) != 0) {
            z1 = false;
        }
        if((v & 4) != 0) {
            s = null;
        }
        postWriteActivity0.s9(z, z1, s);
    }

    @Override  // com.dcinside.app.util.Wk
    public void u(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "viewHolder");
        this.m9();
        View view0 = this.getCurrentFocus();
        if(view0 != null) {
            Nk.a.c(view0);
        }
        ItemTouchHelper itemTouchHelper0 = this.y;
        if(itemTouchHelper0 != null) {
            itemTouchHelper0.H(recyclerView$ViewHolder0);
        }
    }

    // 检测为 Lambda 实现
    private static final void u5(PostWriteActivity postWriteActivity0) [...]

    // 检测为 Lambda 实现
    private static final void u6(Throwable throwable0) [...]

    public final void u7(@m String s, @m String s1, int v) {
        this.C9 = v;
        SeriesManageActivity.E.b(this, this.z9, s, s1);
    }

    // 检测为 Lambda 实现
    private static final void u8(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    private final void u9(String s) {
        this.n9 = s;
        this.I8();
    }

    // 检测为 Lambda 实现
    private static final void v5(PostWriteActivity postWriteActivity0) [...]

    private final void v6() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$executeAutoSave$1", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.PostWriteActivity.t extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.PostWriteActivity.t(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.PostWriteActivity.t(this.l, d0);
            }

            // 检测为 Lambda 实现
            private static final void f(PostWriteActivity postWriteActivity0) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.write.PostWriteActivity.t)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.m9 = true;
                b0 b00 = this.l.x;
                b0 b01 = null;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.F.setVisibility(0);
                b0 b02 = this.l.x;
                if(b02 == null) {
                    L.S("binding");
                }
                else {
                    b01 = b02;
                }
                com.dcinside.app.write.a1 a10 = () -> {
                    b0 b00 = this.l.x;
                    if(b00 == null) {
                        L.S("binding");
                        b00 = null;
                    }
                    b00.F.setVisibility(8);
                };
                b01.F.postDelayed(a10, 3000L);
                return S0.a;
            }
        }

        if(!dl.a.X()) {
            return;
        }
        if(!kl.a(new o[]{this.M8})) {
            return;
        }
        String s = wk.d.d();
        if(s == null) {
            return;
        }
        this.M8 = this.n9(s, true);
        if(!this.m9) {
            kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.e(), null, new com.dcinside.app.write.PostWriteActivity.t(this, null), 2, null);
        }
    }

    public final void v7(@m VideoInfoData videoInfoData0, int v) {
        this.E = v;
        String s = this.D6();
        VideoSettingActivity.B.a(this, null, videoInfoData0, s, this.y9);
    }

    private final void v8(boolean z, A3.a a0) {
        static final class K0 extends N implements Function1 {
            public static final K0 e;

            static {
                K0.e = new K0();
            }

            K0() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F150252);  // string:def_ai_image_fail_limit "자동 짤방 AI 이미지 일일 생성 횟수를 초과하여 등록할 수 없습니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class M0 extends N implements Function1 {
            public static final M0 e;

            static {
                M0.e = new M0();
            }

            M0() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F150251);  // string:def_ai_image_fail_api "AI 이미지 생성에 실패하였습니다. 다시 시도하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class N0 extends N implements Function1 {
            final A3.a e;
            final PostWriteActivity f;

            N0(A3.a a0, PostWriteActivity postWriteActivity0) {
                this.e = a0;
                this.f = postWriteActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    A3.a a0 = this.e;
                    if(a0 != null) {
                        a0.invoke();
                    }
                }
                else {
                    this.f.L.o0();
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e e0 = com.dcinside.app.perform.e.e.a(this);
        if(z) {
            String s = Bk.F(System.currentTimeMillis());
            dl dl0 = dl.a;
            dl0.f3(s);
            String s1 = B.E.k0();
            if(s1 != null && s1.length() > 0) {
                dl0.g3(s);
            }
            e0.n(K0.e).z(0x7F150250).b().x5((Object object0) -> {
                L.p(new PostWriteActivity.L0(this), "$tmp0");
                new PostWriteActivity.L0(this).invoke(object0);
            });
            return;
        }
        e0.n(M0.e).z(0x7F150250).x(0x7F15024F).b().x5((Object object0) -> {
            L.p(new N0(a0, this), "$tmp0");
            new N0(a0, this).invoke(object0);
        });
    }

    private final void v9(com.dcinside.app.model.p p0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$setDcconDetailView$1", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j1 extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final PostWriteActivity l;

            j1(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new j1(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                b0 b00 = this.l.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.P.setVisibility(8);
                DcConPickerView dcConPickerView0 = this.l.P.k();
                if(dcConPickerView0 != null) {
                    dcConPickerView0.setDcconOnDetail(null);
                }
                return S0.a;
            }
        }

        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        Context context0 = b00.b().getContext();
        c4 c40 = this.U9;
        if(c40 == null) {
            L.S("dcconDetailBinding");
            c40 = null;
        }
        com.facebook.drawee.controller.a a0 = ((com.facebook.drawee.backends.pipeline.f)com.facebook.drawee.backends.pipeline.d.j().j0(p0.r()).I(true)).e();
        c40.c.setController(a0);
        String s = p0.t() == null ? "" : p0.t();
        String s1 = com.dcinside.app.dccon.setting.tag.a.f.d(p0.s(), p0.q());
        if(s1 == null) {
            c4 c43 = this.U9;
            if(c43 == null) {
                L.S("dcconDetailBinding");
                c43 = null;
            }
            String s4 = context0.getString(0x7F15024E, new Object[]{s});  // string:dccon_tag_with_hashtag "#%1$s"
            c43.e.setText(s4);
        }
        else if(s.length() > 2 && s1.length() > 3) {
            c4 c41 = this.U9;
            if(c41 == null) {
                L.S("dcconDetailBinding");
                c41 = null;
            }
            String s2 = context0.getString(0x7F15024A, new Object[]{s, s1});  // string:dccon_tag_custom_tag_with_line_break "#%1$s\n#%2$s"
            c41.e.setText(s2);
        }
        else {
            c4 c42 = this.U9;
            if(c42 == null) {
                L.S("dcconDetailBinding");
                c42 = null;
            }
            String s3 = context0.getString(0x7F150249, new Object[]{s, s1});  // string:dccon_tag_custom_tag "#%1$s #%2$s"
            c42.e.setText(s3);
        }
        c4 c44 = this.U9;
        if(c44 == null) {
            L.S("dcconDetailBinding");
            c44 = null;
        }
        L.o(c44.b, "dcconPickerDetailClose");
        j1 postWriteActivity$j10 = new j1(this, null);
        r.M(c44.b, null, postWriteActivity$j10, 1, null);
        DcConPickerView dcConPickerView0 = this.P.k();
        if(dcConPickerView0 != null) {
            dcConPickerView0.setDcconOnDetail(p0);
        }
    }

    @Override  // com.dcinside.app.write.results.PostTempActivityResult$a
    public void w(long v, boolean z) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onPostTempActivityResult$1", f = "PostWriteActivity.kt", i = {2}, l = {0x920, 0x92A, 0x92F, 0x93E}, m = "invokeSuspend", n = {"copied"}, s = {"L$0"})
        @s0({"SMAP\nPostWriteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$onPostTempActivityResult$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4099:1\n120#2,3:4100\n124#2:4105\n1#3:4103\n1#3:4104\n*S KotlinDebug\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$onPostTempActivityResult$1\n*L\n2341#1:4100,3\n2341#1:4105\n2341#1:4103\n*E\n"})
        static final class Y0 extends kotlin.coroutines.jvm.internal.o implements A3.o {
            Object k;
            int l;
            final PostWriteActivity m;
            final long n;
            final boolean o;

            Y0(PostWriteActivity postWriteActivity0, long v, boolean z, kotlin.coroutines.d d0) {
                this.m = postWriteActivity0;
                this.n = v;
                this.o = z;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new Y0(this.m, this.n, this.o, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((Y0)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onPostTempActivityResult$1$1", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.write.PostWriteActivity.Y0.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final PostWriteActivity l;

                    com.dcinside.app.write.PostWriteActivity.Y0.a(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                        this.l = postWriteActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.write.PostWriteActivity.Y0.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.write.PostWriteActivity.Y0.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        PostWriteActivity.t9(this.l, true, false, null, 6, null);
                        return S0.a;
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onPostTempActivityResult$1$2", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nPostWriteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteActivity.kt\ncom/dcinside/app/write/PostWriteActivity$onPostTempActivityResult$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4099:1\n1#2:4100\n*E\n"})
                static final class com.dcinside.app.write.PostWriteActivity.Y0.b extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final PostWriteActivity l;
                    final j0 m;

                    com.dcinside.app.write.PostWriteActivity.Y0.b(PostWriteActivity postWriteActivity0, j0 j00, kotlin.coroutines.d d0) {
                        this.l = postWriteActivity0;
                        this.m = j00;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.write.PostWriteActivity.Y0.b(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.write.PostWriteActivity.Y0.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        for(Object object1: this.l.L.S()) {
                            k0 k00 = (k0)object1;
                            com.dcinside.app.realm.k0.a k0$a0 = k0.r;
                            if(k0$a0.D(k00) && !k0$a0.C(k00)) {
                                String s = k00.b6();
                                String[] arr_s = s == null ? null : k0$a0.P(s);
                                if(arr_s != null) {
                                    String s1 = (String)kotlin.collections.l.Pe(arr_s, 2);
                                    if(s1 != null) {
                                        this.l.L.I().add(s1);
                                    }
                                }
                            }
                        }
                        this.l.L.S().clear();
                        if(!this.m.Q5().isEmpty()) {
                            this.l.L.E();
                        }
                        this.l.L.notifyDataSetChanged();
                        return S0.a;
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onPostTempActivityResult$1$3", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.write.PostWriteActivity.Y0.c extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final boolean l;
                    final PostWriteActivity m;
                    final j0 n;

                    com.dcinside.app.write.PostWriteActivity.Y0.c(boolean z, PostWriteActivity postWriteActivity0, j0 j00, kotlin.coroutines.d d0) {
                        this.l = z;
                        this.m = postWriteActivity0;
                        this.n = j00;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.write.PostWriteActivity.Y0.c(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.write.PostWriteActivity.Y0.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        if(this.l) {
                            this.m.e9 = true;
                            long v = this.n.T5();
                            this.m.l9 = v;
                        }
                        long v1 = this.n.T5();
                        this.m.J = v1;
                        b0 b00 = this.m.x;
                        if(b00 == null) {
                            L.S("binding");
                            b00 = null;
                        }
                        String s = this.n.R5();
                        b00.y0.setText(s);
                        this.m.L.r0(false);
                        io.realm.T0 t00 = this.n.Q5();
                        this.m.L.S().addAll(t00);
                        this.m.L.notifyDataSetChanged();
                        PostWriteActivity.t9(this.m, false, false, null, 6, null);
                        return S0.a;
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.PostWriteActivity$onPostTempActivityResult$1$copied$2", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.write.PostWriteActivity.Y0.d extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final PostWriteActivity l;

                    com.dcinside.app.write.PostWriteActivity.Y0.d(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                        this.l = postWriteActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.write.PostWriteActivity.Y0.d(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.write.PostWriteActivity.Y0.d)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        PostWriteActivity.t9(this.l, false, false, null, 6, null);
                        return S0.a;
                    }
                }

                j0 j00;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        com.dcinside.app.write.PostWriteActivity.Y0.a postWriteActivity$Y0$a0 = new com.dcinside.app.write.PostWriteActivity.Y0.a(this.m, null);
                        this.l = 1;
                        if(i.h(h0.e(), postWriteActivity$Y0$a0, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 3: {
                        j00 = (j0)this.k;
                        f0.n(object0);
                        goto label_40;
                    }
                    case 4: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                F0 f00 = F0.g4();
                try {
                    L.m(f00);
                    j0 j01 = (j0)f00.C4(j0.class).g0("time", kotlin.coroutines.jvm.internal.b.g(this.n)).r0();
                    j00 = j01 == null ? null : ((j0)f00.d2(j01));
                }
                catch(Throwable throwable0) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable0;
                }
                kotlin.io.c.a(f00, null);
                if(j00 == null) {
                    com.dcinside.app.write.PostWriteActivity.Y0.d postWriteActivity$Y0$d0 = new com.dcinside.app.write.PostWriteActivity.Y0.d(this.m, null);
                    this.l = 2;
                    return i.h(h0.e(), postWriteActivity$Y0$d0, this) == object1 ? object1 : S0.a;
                }
                com.dcinside.app.write.PostWriteActivity.Y0.b postWriteActivity$Y0$b0 = new com.dcinside.app.write.PostWriteActivity.Y0.b(this.m, j00, null);
                this.k = j00;
                this.l = 3;
                if(i.h(h0.e(), postWriteActivity$Y0$b0, this) == object1) {
                    return object1;
                }
            label_40:
                io.realm.T0 t00 = j00.Q5();
                com.dcinside.app.write.temp.r.a.c(wk.d, wk.b, t00);
                com.dcinside.app.write.PostWriteActivity.Y0.c postWriteActivity$Y0$c0 = new com.dcinside.app.write.PostWriteActivity.Y0.c(this.o, this.m, j00, null);
                this.k = null;
                this.l = 4;
                return i.h(h0.e(), postWriteActivity$Y0$c0, this) == object1 ? object1 : S0.a;
            }
        }

        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), h0.c(), null, new Y0(this, v, z, null), 2, null);
    }

    // 检测为 Lambda 实现
    private static final void w5(Function1 function10, Object object0) [...]

    private final void w6(Collection collection0) {
        static final class com.dcinside.app.write.PostWriteActivity.u extends N implements Function1 {
            final PostWriteActivity e;

            com.dcinside.app.write.PostWriteActivity.u(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(com.dcinside.app.model.j j0) {
                if(L.g(j0.h(), Boolean.TRUE)) {
                    String s = j0.f();
                    if(s != null) {
                        this.e.M8(s);
                    }
                }
                else {
                    this.e.I9((j0.g() == null ? "" : j0.g()));
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.j)object0));
                return S0.a;
            }
        }

        String s = (String)u.E2(collection0);
        if(s == null) {
            return;
        }
        this.H9 = uk.nk(s).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                b0 b00 = this.x;
                b0 b01 = null;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.k.setVisibility(0);
                b0 b02 = this.x;
                if(b02 == null) {
                    L.S("binding");
                }
                else {
                    b01 = b02;
                }
                b01.o.setVisibility(0);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                b0 b00 = this.x;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.o.setVisibility(8);
            }
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.PostWriteActivity.u(this), "$tmp0");
            new com.dcinside.app.write.PostWriteActivity.u(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.o("잠시 후 다시 시도해주세요.", "getString(...)");
            this.I9("잠시 후 다시 시도해주세요.");
        });
    }

    private final void w7(float f) {
        b0 b00 = this.x;
        Integer integer0 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        ConstraintLayout constraintLayout0 = b00.z;
        L.o(constraintLayout0, "postWriteAiEasyWrap");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = constraintLayout0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        Integer integer1 = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)viewGroup$LayoutParams0).height;
        if(integer1.intValue() > 0) {
            integer0 = integer1;
        }
        int v = Math.min(((int)(((float)(integer0 == null ? this.L9 : ((int)integer0))) + f)), this.L9);
        if(v > 0) {
            ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)viewGroup$LayoutParams0).height = v;
        }
        constraintLayout0.setLayoutParams(((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)viewGroup$LayoutParams0));
    }

    // 检测为 Lambda 实现
    private static final void w8(Function1 function10, Object object0) [...]

    private final void w9(boolean z) {
        this.q9 = z;
        this.I8();
    }

    // 检测为 Lambda 实现
    private static final void x5(PostWriteActivity postWriteActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void x6(PostWriteActivity postWriteActivity0) [...]

    private final rx.g x7(int v, PostHead postHead0, List list0, List list1, SparseArray sparseArray0, String s, List list2, List list3) {
        PostModify postModify0;
        boolean z = true;
        ArrayList arrayList0 = new ArrayList(u.b0(list1, 10));
        Iterator iterator0 = list1.iterator();
        while(true) {
            postModify0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            String s1 = (String)object0;
            if(!kotlin.text.v.v2(s1, "{{_OG_START::", false, 2, null)) {
                s1 = Yk.b(Yk.c(s1, -1 == v));
            }
            arrayList0.add(s1);
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        com.dcinside.app.model.V v1 = new com.dcinside.app.model.V();
        v1.x(this.n9);
        v1.P(this.o9);
        v1.E(this.D6());
        v1.M(this.p9);
        v1.L(s);
        if(!this.q9 && (this.o9 == null || this.o9.length() <= 0)) {
            z = false;
        }
        v1.C(z);
        v1.w(list3);
        v1.D(this.Z9());
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.W, "postWriteGuest");
        if(b00.W.getVisibility() == 0) {
            b0 b01 = this.x;
            if(b01 == null) {
                L.S("binding");
                b01 = null;
            }
            String s2 = kotlin.text.v.G5(String.valueOf(b01.n0.getText())).toString();
            if(this.Z9()) {
                b0 b02 = this.x;
                if(b02 == null) {
                    L.S("binding");
                    b02 = null;
                }
                s2 = kotlin.text.v.G5(b02.R.getText().toString()).toString();
            }
            b0 b03 = this.x;
            if(b03 == null) {
                L.S("binding");
                b03 = null;
            }
            String s3 = String.valueOf(b03.o0.getText());
            v1.K(kotlin.text.v.G5(s2).toString());
            v1.N(s3);
            e e0 = this.Q;
            if(!this.q7() && e0 != null) {
                String s4 = e0.i();
                if(!m0.a.a.i(s4)) {
                    v1.z(e0.j());
                    v1.y(s4);
                }
            }
        }
        p p0 = this.Y;
        if(p0 != null) {
            p0.e();
        }
        p p1 = new p(list0.size(), this.X);
        this.Y = p1;
        v1.F(postHead0);
        b0 b04 = this.x;
        if(b04 == null) {
            L.S("binding");
            b04 = null;
        }
        v1.Q(String.valueOf(b04.y0.getText()));
        v1.I(arr_s);
        v1.R(((String[])list2.toArray(new String[0])));
        v1.G(list0);
        v1.H(p1.b());
        v1.B(sparseArray0);
        PostModify postModify1 = this.A;
        if(postModify1 != null) {
            if(this.q7()) {
                postModify0 = postModify1;
            }
            if(postModify0 != null) {
                v1.J(String.valueOf(postModify0.V()));
                v1.A(this.L.I());
            }
        }
        rx.g g0 = uk.mG(v1);
        L.o(g0, "postWrite(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final void x8(Function1 function10, Object object0) [...]

    private final void x9(int v) {
        if(this.s1()) {
            return;
        }
        b0 b00 = this.x;
        b0 b01 = null;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        AppBarLayout appBarLayout0 = b00.A;
        L.o(appBarLayout0, "postWriteAppBar");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = appBarLayout0.getLayoutParams();
        L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        Behavior appBarLayout$Behavior0 = (Behavior)((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)viewGroup$LayoutParams0).f();
        if(appBarLayout$Behavior0 != null && appBarLayout$Behavior0.O() != v) {
            appBarLayout$Behavior0.U(v);
        }
        b0 b02 = this.x;
        if(b02 == null) {
            L.S("binding");
        }
        else {
            b01 = b02;
        }
        b01.N.requestLayout();
        appBarLayout0.requestLayout();
    }

    private final void y5(String s, String s1) {
        com.dcinside.app.voice.a a0 = com.dcinside.app.voice.a.d.a(s, com.dcinside.app.voice.a.e, false);
        b0 b00 = null;
        if(a0 == null) {
            a0 = null;
        }
        else {
            String s2 = a0.c();
            if(s2 != null && !kotlin.text.v.x3(s2) == 1) {
                a0 = null;
            }
            else {
                String s3 = a0.d();
                if(s3 != null && !kotlin.text.v.x3(s3) == 1) {
                    a0 = null;
                }
            }
        }
        String s4 = a0 == null ? null : a0.b();
        if(s4 == null) {
            Dl.D(this, 0x7F150816);  // string:post_write_voice_iframe_mismatched "보이스 형식에 맞지 않는 형식입니다. 보이스를 입력을 할 수 없습니다."
            return;
        }
        ArrayList arrayList0 = this.L.S();
        int v = this.M6();
        int v1 = v < 0 ? arrayList0.size() : v + 1;
        int v2 = s4.hashCode();
        com.dcinside.app.realm.k0.a k0$a0 = k0.r;
        k0 k00 = k0$a0.t(s4);
        k00.l6(v2);
        arrayList0.add(v1, k00);
        if(m0.a.a.k(s1)) {
            String s5 = this.getString(0x7F150B90, new Object[]{s1});  // string:voice_subject_append "[%s]"
            L.o(s5, "getString(...)");
            k0 k01 = k0$a0.o(s5);
            k01.l6(v2);
            arrayList0.add(v1, k01);
        }
        this.L.r0(false);
        this.L.notifyItemRangeInserted(v1, 2);
        this.L.p0(new int[0]);
        b0 b01 = this.x;
        if(b01 == null) {
            L.S("binding");
        }
        else {
            b00 = b01;
        }
        b00.w0.scrollToPosition(v1);
    }

    // 检测为 Lambda 实现
    private static final void y6(PostWriteActivity postWriteActivity0) [...]

    // 检测为 Lambda 实现
    private static final Boolean y7(Function1 function10, Object object0) [...]

    private final void y8() {
        static final class O0 extends N implements Function1 {
            public static final O0 e;

            static {
                O0.e = new O0();
            }

            O0() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F150254);  // string:def_ai_resample_path_error "자동 짤방 AI 이미지 타일 리샘플 이미지 처리 중 오류가 발생했습니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.PostWriteActivity.P0 extends N implements Function1 {
            final PostWriteActivity e;

            com.dcinside.app.write.PostWriteActivity.P0(PostWriteActivity postWriteActivity0) {
                this.e = postWriteActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.L.o0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(O0.e).z(0x7F150250).b().x5((Object object0) -> {
            L.p(new com.dcinside.app.write.PostWriteActivity.P0(this), "$tmp0");
            new com.dcinside.app.write.PostWriteActivity.P0(this).invoke(object0);
        });
    }

    public final void y9(@l com.dcinside.rich.c c0) {
        L.p(c0, "<set-?>");
        this.j9 = c0;
    }

    private final void z5(String s) {
        ArrayList arrayList0 = this.L.S();
        int v = this.M6();
        int v1 = v < 0 ? arrayList0.size() : v + 1;
        arrayList0.add(v1, k0.r.u(s));
        this.L.r0(false);
        this.L.notifyItemInserted(v1);
        b0 b00 = this.x;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.w0.scrollToPosition(v1);
        this.L.p0(new int[0]);
    }

    // 检测为 Lambda 实现
    private static final void z6(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void z7(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void z8(Function1 function10, Object object0) [...]

    private final void z9(boolean z) {
        this.p9 = z;
        this.I8();
    }
}

