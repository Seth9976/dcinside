package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import com.karumi.dexter.listener.EmptyPermissionRequestErrorListener;
import com.karumi.dexter.listener.PermissionRequestErrorListener;
import com.karumi.dexter.listener.multi.BaseMultiplePermissionsListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public final class Dexter implements MultiPermissionListener, Permission, SinglePermissionListener, DexterBuilder {
    private PermissionRequestErrorListener errorListener;
    private static DexterInstance instance;
    private MultiplePermissionsListener listener;
    private Collection permissions;
    private boolean shouldExecuteOnSameThread;

    private Dexter(Context context0) {
        this.listener = new BaseMultiplePermissionsListener();
        this.errorListener = new EmptyPermissionRequestErrorListener();
        this.shouldExecuteOnSameThread = false;
        Dexter.initialize(context0);
    }

    @Override  // com.karumi.dexter.DexterBuilder
    public void check() {
        try {
            Thread thread0 = this.getThread();
            Dexter.instance.checkPermissions(this.listener, this.permissions, thread0);
        }
        catch(DexterException dexterException0) {
            this.errorListener.onError(dexterException0.error);
        }
    }

    // 去混淆评级： 低(20)
    private Thread getThread() {
        return this.shouldExecuteOnSameThread ? ThreadFactory.makeSameThread() : ThreadFactory.makeMainThread();
    }

    private static void initialize(Context context0) {
        DexterInstance dexterInstance0 = Dexter.instance;
        if(dexterInstance0 == null) {
            Dexter.instance = new DexterInstance(context0, new AndroidPermissionService(), new IntentProvider());
            return;
        }
        dexterInstance0.setContext(context0);
    }

    static void onActivityDestroyed(DexterActivity dexterActivity0) {
        DexterInstance dexterInstance0 = Dexter.instance;
        if(dexterInstance0 != null) {
            dexterInstance0.onActivityDestroyed(dexterActivity0);
        }
    }

    static void onActivityReady(Activity activity0) {
        DexterInstance dexterInstance0 = Dexter.instance;
        if(dexterInstance0 != null) {
            dexterInstance0.onActivityReady(activity0);
        }
    }

    static void onPermissionsRequested(Collection collection0, Collection collection1) {
        DexterInstance dexterInstance0 = Dexter.instance;
        if(dexterInstance0 != null) {
            dexterInstance0.onPermissionRequestGranted(collection0);
            Dexter.instance.onPermissionRequestDenied(collection1);
        }
    }

    @Override  // com.karumi.dexter.DexterBuilder
    public DexterBuilder onSameThread() {
        this.shouldExecuteOnSameThread = true;
        return this;
    }

    @Deprecated
    public static Permission withActivity(Activity activity0) {
        return new Dexter(activity0);
    }

    public static Permission withContext(Context context0) {
        return new Dexter(context0);
    }

    @Override  // com.karumi.dexter.DexterBuilder
    public DexterBuilder withErrorListener(PermissionRequestErrorListener permissionRequestErrorListener0) {
        this.errorListener = permissionRequestErrorListener0;
        return this;
    }

    @Override  // com.karumi.dexter.DexterBuilder$MultiPermissionListener
    public DexterBuilder withListener(MultiplePermissionsListener multiplePermissionsListener0) {
        this.listener = multiplePermissionsListener0;
        return this;
    }

    @Override  // com.karumi.dexter.DexterBuilder$SinglePermissionListener
    public DexterBuilder withListener(PermissionListener permissionListener0) {
        this.listener = new MultiplePermissionsListenerToPermissionListenerAdapter(permissionListener0);
        return this;
    }

    @Override  // com.karumi.dexter.DexterBuilder$Permission
    public SinglePermissionListener withPermission(String s) {
        this.permissions = Collections.singletonList(s);
        return this;
    }

    @Override  // com.karumi.dexter.DexterBuilder$Permission
    public MultiPermissionListener withPermissions(Collection collection0) {
        this.permissions = new ArrayList(collection0);
        return this;
    }

    @Override  // com.karumi.dexter.DexterBuilder$Permission
    public MultiPermissionListener withPermissions(String[] arr_s) {
        this.permissions = Arrays.asList(arr_s);
        return this;
    }
}

