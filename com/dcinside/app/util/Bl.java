package com.dcinside.app.util;

import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.internal.t;
import com.dcinside.app.perform.e;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPermissions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Permissions.kt\ncom/dcinside/app/util/PermissionCallback\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n147#2:160\n147#2:161\n1#3:162\n*S KotlinDebug\n*F\n+ 1 Permissions.kt\ncom/dcinside/app/util/PermissionCallback\n*L\n119#1:160\n120#1:161\n*E\n"})
final class bl implements MultiplePermissionsListener {
    private final boolean a;
    @l
    private final t b;
    @l
    private final t c;

    public bl(@l AppCompatActivity appCompatActivity0, @l PermissionListener permissionListener0, boolean z) {
        L.p(appCompatActivity0, "activity");
        L.p(permissionListener0, "callback");
        super();
        this.a = z;
        this.b = new t(appCompatActivity0);
        this.c = new t(permissionListener0);
    }

    public final boolean c() {
        return this.a;
    }

    // 检测为 Lambda 实现
    private static final void d(Function1 function10, Object object0) [...]

    @Override  // com.karumi.dexter.listener.multi.MultiplePermissionsListener
    public void onPermissionRationaleShouldBeShown(@m List list0, @m PermissionToken permissionToken0) {
        PermissionRequest permissionRequest0 = list0 == null ? null : ((PermissionRequest)u.G2(list0));
        PermissionListener permissionListener0 = (PermissionListener)this.c.a();
        if(permissionListener0 != null) {
            permissionListener0.onPermissionRationaleShouldBeShown(permissionRequest0, permissionToken0);
        }
    }

    @Override  // com.karumi.dexter.listener.multi.MultiplePermissionsListener
    public void onPermissionsChecked(@m MultiplePermissionsReport multiplePermissionsReport0) {
        static final class a extends N implements Function1 {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F150766);  // string:permission_deny_permanently "일부 권한이 \'다시 묻지 않기\' 설정되어 권한을 요청할 수 없습니다.\n\n권한 
                                            // 설정을 누르면 앱 설정 화면으로 이동합니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class b extends N implements Function1 {
            final bl e;

            b(bl bl0) {
                this.e = bl0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                if(!boolean0.booleanValue()) {
                    return;
                }
                AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.e.b.a();
                if(appCompatActivity0 == null) {
                    return;
                }
                Dl.B(appCompatActivity0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        PermissionGrantedResponse permissionGrantedResponse0 = null;
        AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.b.a();
        if(appCompatActivity0 != null) {
            if(appCompatActivity0.isFinishing()) {
                appCompatActivity0 = null;
            }
            if(appCompatActivity0 == null || multiplePermissionsReport0 == null) {
                return;
            }
            if(multiplePermissionsReport0.areAllPermissionsGranted()) {
                List list0 = multiplePermissionsReport0.getGrantedPermissionResponses();
                if(list0.size() <= 1) {
                    L.m(list0);
                    permissionGrantedResponse0 = (PermissionGrantedResponse)u.G2(list0);
                }
                PermissionListener permissionListener0 = (PermissionListener)this.c.a();
                if(permissionListener0 != null) {
                    permissionListener0.onPermissionGranted(permissionGrantedResponse0);
                }
            }
            else {
                if(multiplePermissionsReport0.isAnyPermissionPermanentlyDenied()) {
                    if(this.a) {
                        return;
                    }
                    e.e.a(appCompatActivity0).n(a.e).z(0x7F150764).x(0x1040000).b().x5((Object object0) -> {
                        L.p(new b(this), "$tmp0");
                        new b(this).invoke(object0);
                    });
                    return;
                }
                if(multiplePermissionsReport0.getDeniedPermissionResponses().size() > 0) {
                    List list1 = multiplePermissionsReport0.getDeniedPermissionResponses();
                    L.o(list1, "getDeniedPermissionResponses(...)");
                    PermissionDeniedResponse permissionDeniedResponse0 = (PermissionDeniedResponse)u.G2(list1);
                    PermissionListener permissionListener1 = (PermissionListener)this.c.a();
                    if(permissionListener1 != null) {
                        permissionListener1.onPermissionDenied(permissionDeniedResponse0);
                    }
                }
            }
        }
    }
}

