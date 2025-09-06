package com.dcinside.app.util;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class cl {
    @l
    public static final cl a;

    static {
        cl.a = new cl();
    }

    @n
    public static final boolean a(@l AppCompatActivity appCompatActivity0, @l PermissionListener permissionListener0) {
        L.p(appCompatActivity0, "activity");
        L.p(permissionListener0, "callback");
        List list0 = u.k("android.permission.CAMERA");
        return cl.h(cl.a, appCompatActivity0, list0, permissionListener0, false, 8, null);
    }

    @n
    public static final int b(@m String s) {
        if(s != null) {
            switch(s) {
                case "android.permission.READ_EXTERNAL_STORAGE": {
                    return 0x7F150768;  // string:permission_deny_storage "\'저장\' 권한이 거부되었습니다.\n이 권한이 없으면 기능을 사용할 수 없습니다.\n\n권한을 
                                        // 확인해주세요."
                }
                case "android.permission.RECORD_AUDIO": {
                    return 0x7F150767;  // string:permission_deny_record "\'마이크\' 권한이 거부되었습니다.\n이 권한이 없으면 기능을 사용할 수 없습니다.\n\n권한을 
                                        // 확인해주세요."
                }
                case "android.permission.WRITE_EXTERNAL_STORAGE": {
                    return 0x7F150768;  // string:permission_deny_storage "\'저장\' 권한이 거부되었습니다.\n이 권한이 없으면 기능을 사용할 수 없습니다.\n\n권한을 
                                        // 확인해주세요."
                }
                default: {
                    return 0x7F150765;  // string:permission_deny_default "권한이 거부되었습니다.\n이 권한이 없으면 기능을 사용할 수 없습니다.\n\n권한을 확인해주세요."
                }
            }
        }
        return 0x7F150765;  // string:permission_deny_default "권한이 거부되었습니다.\n이 권한이 없으면 기능을 사용할 수 없습니다.\n\n권한을 확인해주세요."
    }

    @n
    public static final int c(@m String s) {
        if(s != null) {
            switch(s) {
                case "android.permission.READ_EXTERNAL_STORAGE": {
                    return 0x7F15076B;  // string:permission_grant_storage "파일 쓰기 권한이 부여되었습니다."
                }
                case "android.permission.RECORD_AUDIO": {
                    return 0x7F15076A;  // string:permission_grant_record "녹음 권한이 부여되었습니다."
                }
                case "android.permission.WRITE_EXTERNAL_STORAGE": {
                    return 0x7F15076B;  // string:permission_grant_storage "파일 쓰기 권한이 부여되었습니다."
                }
                default: {
                    return 0x7F150769;  // string:permission_grant_default "권한이 부여되었습니다."
                }
            }
        }
        return 0x7F150769;  // string:permission_grant_default "권한이 부여되었습니다."
    }

    public final boolean d(@l Context context0, @l String s) {
        L.p(context0, "context");
        L.p(s, "permission");
        return ContextCompat.checkSelfPermission(context0, s) == 0;
    }

    @n
    public static final void e(@l AppCompatActivity appCompatActivity0, @l PermissionListener permissionListener0) {
        L.p(appCompatActivity0, "activity");
        L.p(permissionListener0, "callback");
        if(Build.VERSION.SDK_INT < 33) {
            return;
        }
        List list0 = u.k("android.permission.POST_NOTIFICATIONS");
        cl.a.g(appCompatActivity0, list0, permissionListener0, true);
    }

    @n
    public static final boolean f(@l AppCompatActivity appCompatActivity0, @l PermissionListener permissionListener0) {
        L.p(appCompatActivity0, "activity");
        L.p(permissionListener0, "callback");
        List list0 = u.k("android.permission.RECORD_AUDIO");
        return cl.h(cl.a, appCompatActivity0, list0, permissionListener0, false, 8, null);
    }

    public final boolean g(@l AppCompatActivity appCompatActivity0, @l List list0, @l PermissionListener permissionListener0, boolean z) {
        L.p(appCompatActivity0, "activity");
        L.p(list0, "permissions");
        L.p(permissionListener0, "callback");
        if(!appCompatActivity0.isFinishing() && !appCompatActivity0.isDestroyed()) {
            for(Object object0: list0) {
                if(PermissionChecker.d(appCompatActivity0, ((String)object0)) != 0) {
                    Dexter.withContext(appCompatActivity0).withPermissions(list0).withListener(new bl(appCompatActivity0, permissionListener0, z)).check();
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean h(cl cl0, AppCompatActivity appCompatActivity0, List list0, PermissionListener permissionListener0, boolean z, int v, Object object0) {
        if((v & 8) != 0) {
            z = false;
        }
        return cl0.g(appCompatActivity0, list0, permissionListener0, z);
    }

    @n
    public static final boolean i(@l AppCompatActivity appCompatActivity0, @l PermissionListener permissionListener0) {
        List list0;
        L.p(appCompatActivity0, "activity");
        L.p(permissionListener0, "callback");
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            list0 = u.O(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"});
            return cl.h(cl.a, appCompatActivity0, list0, permissionListener0, false, 8, null);
        }
        if(v >= 29) {
            list0 = u.k("android.permission.READ_EXTERNAL_STORAGE");
            return cl.h(cl.a, appCompatActivity0, list0, permissionListener0, false, 8, null);
        }
        list0 = u.k("android.permission.WRITE_EXTERNAL_STORAGE");
        return cl.h(cl.a, appCompatActivity0, list0, permissionListener0, false, 8, null);
    }
}

