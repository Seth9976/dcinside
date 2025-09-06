package com.karumi.dexter;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback;
import java.util.Arrays;
import java.util.LinkedList;

public final class DexterActivity extends Activity implements OnRequestPermissionsResultCallback {
    private boolean isTargetSdkUnderAndroidM() {
        try {
            this.getPackageManager().getPackageInfo("com.dcinside.app.android", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Dexter.onActivityReady(this);
        this.getWindow().addFlags(16);
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Dexter.onActivityDestroyed(this);
    }

    @Override  // android.app.Activity
    protected void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        Dexter.onActivityReady(this);
    }

    @Override  // android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        LinkedList linkedList0 = new LinkedList();
        LinkedList linkedList1 = new LinkedList();
        if(this.isTargetSdkUnderAndroidM()) {
            linkedList1.addAll(Arrays.asList(arr_s));
        }
        else {
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s = arr_s[v1];
                switch(arr_v[v1]) {
                    case -2: 
                    case -1: {
                        linkedList1.add(s);
                        break;
                    }
                    case 0: {
                        linkedList0.add(s);
                    }
                }
            }
        }
        Dexter.onPermissionsRequested(linkedList0, linkedList1);
    }
}

