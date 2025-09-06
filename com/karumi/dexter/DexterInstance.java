package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.karumi.dexter.listener.DexterError;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.BaseMultiplePermissionsListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

final class DexterInstance {
    final class PermissionStates {
        private final Collection deniedPermissions;
        private final Collection grantedPermissions;
        private final Collection impossibleToGrantPermissions;

        private PermissionStates() {
            this.deniedPermissions = new LinkedList();
            this.impossibleToGrantPermissions = new LinkedList();
            this.grantedPermissions = new LinkedList();
        }

        PermissionStates(com.karumi.dexter.DexterInstance.1 dexterInstance$10) {
        }

        private void addDeniedPermission(String s) {
            this.deniedPermissions.add(s);
        }

        private void addGrantedPermission(String s) {
            this.grantedPermissions.add(s);
        }

        private void addImpossibleToGrantPermission(String s) {
            this.impossibleToGrantPermissions.add(s);
        }

        private Collection getDeniedPermissions() {
            return this.deniedPermissions;
        }

        private Collection getGrantedPermissions() {
            return this.grantedPermissions;
        }

        public Collection getImpossibleToGrantPermissions() {
            return this.impossibleToGrantPermissions;
        }
    }

    private static final MultiplePermissionsListener EMPTY_LISTENER = null;
    private static final int PERMISSIONS_REQUEST_CODE = 42;
    private Activity activity;
    private final AndroidPermissionService androidPermissionService;
    private WeakReference context;
    private final IntentProvider intentProvider;
    private final AtomicBoolean isRequestingPermission;
    private final AtomicBoolean isShowingNativeDialog;
    private MultiplePermissionsListener listener;
    private final MultiplePermissionsReport multiplePermissionsReport;
    private final Collection pendingPermissions;
    private final Object pendingPermissionsMutex;
    private final AtomicBoolean rationaleAccepted;

    static {
        DexterInstance.EMPTY_LISTENER = new BaseMultiplePermissionsListener();
    }

    DexterInstance(Context context0, AndroidPermissionService androidPermissionService0, IntentProvider intentProvider0) {
        this.pendingPermissionsMutex = new Object();
        this.listener = DexterInstance.EMPTY_LISTENER;
        this.androidPermissionService = androidPermissionService0;
        this.intentProvider = intentProvider0;
        this.pendingPermissions = new TreeSet();
        this.multiplePermissionsReport = new MultiplePermissionsReport();
        this.isRequestingPermission = new AtomicBoolean();
        this.rationaleAccepted = new AtomicBoolean();
        this.isShowingNativeDialog = new AtomicBoolean();
        this.setContext(context0);
    }

    private void checkMultiplePermissions(MultiplePermissionsListener multiplePermissionsListener0, Collection collection0, Thread thread0) {
        this.checkNoDexterRequestOngoing();
        this.checkRequestSomePermission(collection0);
        if(this.context.get() == null) {
            return;
        }
        if(this.activity != null && this.activity.isFinishing()) {
            this.onActivityDestroyed(this.activity);
        }
        this.pendingPermissions.clear();
        this.pendingPermissions.addAll(collection0);
        this.multiplePermissionsReport.clear();
        this.listener = new MultiplePermissionListenerThreadDecorator(multiplePermissionsListener0, thread0);
        if(this.isEveryPermissionGranted(collection0, ((Context)this.context.get()))) {
            thread0.execute(new Runnable() {
                @Override
                public void run() {
                    MultiplePermissionsReport multiplePermissionsReport0 = new MultiplePermissionsReport();
                    for(Object object0: collection0) {
                        multiplePermissionsReport0.addGrantedPermissionResponse(PermissionGrantedResponse.from(((String)object0)));
                    }
                    DexterInstance.this.isRequestingPermission.set(false);
                    multiplePermissionsListener0.onPermissionsChecked(multiplePermissionsReport0);
                    DexterInstance.this.listener = DexterInstance.EMPTY_LISTENER;
                }
            });
        }
        else {
            this.startTransparentActivityIfNeeded();
        }
        thread0.loop();
    }

    private void checkNoDexterRequestOngoing() {
        if(this.isRequestingPermission.getAndSet(true)) {
            throw new DexterException("Only one Dexter request at a time is allowed", DexterError.REQUEST_ONGOING);
        }
    }

    void checkPermission(PermissionListener permissionListener0, String s, Thread thread0) {
        this.checkSinglePermission(permissionListener0, s, thread0);
    }

    void checkPermissions(MultiplePermissionsListener multiplePermissionsListener0, Collection collection0, Thread thread0) {
        this.checkMultiplePermissions(multiplePermissionsListener0, collection0, thread0);
    }

    private void checkRequestSomePermission(Collection collection0) {
        if(collection0.isEmpty()) {
            throw new DexterException("Dexter has to be called with at least one permission", DexterError.NO_PERMISSIONS_REQUESTED);
        }
    }

    private int checkSelfPermission(Activity activity0, String s) {
        try {
            return this.androidPermissionService.checkSelfPermission(activity0, s);
        }
        catch(RuntimeException unused_ex) {
            return -1;
        }
    }

    private void checkSinglePermission(PermissionListener permissionListener0, String s, Thread thread0) {
        this.checkMultiplePermissions(new MultiplePermissionsListenerToPermissionListenerAdapter(permissionListener0), Collections.singleton(s), thread0);
    }

    private PermissionStates getPermissionStates(Collection collection0) {
        PermissionStates dexterInstance$PermissionStates0 = new PermissionStates(this, null);
        for(Object object0: collection0) {
            String s = (String)object0;
            switch(this.checkSelfPermission(this.activity, s)) {
                case -2: {
                    dexterInstance$PermissionStates0.addImpossibleToGrantPermission(s);
                    break;
                }
                case -1: {
                    dexterInstance$PermissionStates0.addDeniedPermission(s);
                    break;
                }
                default: {
                    dexterInstance$PermissionStates0.addGrantedPermission(s);
                }
            }
        }
        return dexterInstance$PermissionStates0;
    }

    private void handleDeniedPermissions(Collection collection0) {
        if(collection0.isEmpty()) {
            return;
        }
        LinkedList linkedList0 = new LinkedList();
        for(Object object0: collection0) {
            String s = (String)object0;
            if(this.androidPermissionService.shouldShowRequestPermissionRationale(this.activity, s)) {
                linkedList0.add(new PermissionRequest(s));
            }
        }
        if(linkedList0.isEmpty()) {
            this.requestPermissionsToSystem(collection0);
            return;
        }
        if(!this.rationaleAccepted.get()) {
            PermissionRationaleToken permissionRationaleToken0 = new PermissionRationaleToken(this);
            this.listener.onPermissionRationaleShouldBeShown(linkedList0, permissionRationaleToken0);
        }
    }

    private boolean isEveryPermissionGranted(Collection collection0, Context context0) {
        for(Object object0: collection0) {
            if(this.androidPermissionService.checkSelfPermission(context0, ((String)object0)) != 0) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    void onActivityDestroyed(Activity activity0) {
        if(this.activity == activity0) {
            this.activity = null;
            this.isRequestingPermission.set(false);
            this.rationaleAccepted.set(false);
            this.isShowingNativeDialog.set(false);
            this.listener = DexterInstance.EMPTY_LISTENER;
        }
    }

    void onActivityReady(Activity activity0) {
        PermissionStates dexterInstance$PermissionStates0;
        this.activity = activity0;
        synchronized(this.pendingPermissionsMutex) {
            dexterInstance$PermissionStates0 = activity0 == null ? null : this.getPermissionStates(this.pendingPermissions);
        }
        if(dexterInstance$PermissionStates0 != null) {
            this.handleDeniedPermissions(dexterInstance$PermissionStates0.getDeniedPermissions());
            this.updatePermissionsAsDenied(dexterInstance$PermissionStates0.getImpossibleToGrantPermissions());
            this.updatePermissionsAsGranted(dexterInstance$PermissionStates0.getGrantedPermissions());
        }
    }

    void onCancelPermissionRequest() {
        this.rationaleAccepted.set(false);
        this.updatePermissionsAsDenied(this.pendingPermissions);
    }

    void onContinuePermissionRequest() {
        this.rationaleAccepted.set(true);
        this.requestPermissionsToSystem(this.pendingPermissions);
    }

    void onPermissionRequestDenied(Collection collection0) {
        this.updatePermissionsAsDenied(collection0);
    }

    void onPermissionRequestGranted(Collection collection0) {
        this.updatePermissionsAsGranted(collection0);
    }

    private void onPermissionsChecked(Collection collection0) {
        if(this.pendingPermissions.isEmpty()) {
            return;
        }
        synchronized(this.pendingPermissionsMutex) {
            this.pendingPermissions.removeAll(collection0);
            if(this.pendingPermissions.isEmpty()) {
                Activity activity0 = this.activity;
                if(activity0 != null) {
                    activity0.finish();
                }
                this.isRequestingPermission.set(false);
                this.rationaleAccepted.set(false);
                this.isShowingNativeDialog.set(false);
                MultiplePermissionsListener multiplePermissionsListener0 = this.listener;
                this.listener = DexterInstance.EMPTY_LISTENER;
                multiplePermissionsListener0.onPermissionsChecked(this.multiplePermissionsReport);
            }
        }
    }

    private void requestPermissionsToSystem(Collection collection0) {
        if(!this.isShowingNativeDialog.get()) {
            Activity activity0 = this.activity;
            String[] arr_s = (String[])collection0.toArray(new String[0]);
            this.androidPermissionService.requestPermissions(activity0, arr_s, 42);
        }
        this.isShowingNativeDialog.set(true);
    }

    void setContext(Context context0) {
        this.context = new WeakReference(context0);
    }

    private void startTransparentActivityIfNeeded() {
        Context context0 = (Context)this.context.get();
        if(context0 == null) {
            return;
        }
        Intent intent0 = this.intentProvider.get(context0, DexterActivity.class);
        if(!(context0 instanceof Activity)) {
            intent0.addFlags(0x10000000);
        }
        context0.startActivity(intent0);
    }

    private void updatePermissionsAsDenied(Collection collection0) {
        for(Object object0: collection0) {
            PermissionDeniedResponse permissionDeniedResponse0 = PermissionDeniedResponse.from(((String)object0), this.androidPermissionService.isPermissionPermanentlyDenied(this.activity, ((String)object0)));
            this.multiplePermissionsReport.addDeniedPermissionResponse(permissionDeniedResponse0);
        }
        this.onPermissionsChecked(collection0);
    }

    private void updatePermissionsAsGranted(Collection collection0) {
        for(Object object0: collection0) {
            PermissionGrantedResponse permissionGrantedResponse0 = PermissionGrantedResponse.from(((String)object0));
            this.multiplePermissionsReport.addGrantedPermissionResponse(permissionGrantedResponse0);
        }
        this.onPermissionsChecked(collection0);
    }
}

