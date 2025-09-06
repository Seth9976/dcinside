package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import androidx.annotation.RequiresApi;
import java.util.Map;

@RequiresApi(api = 30)
final class y {
    static boolean a(Context context0, Map map0) {
        ResourcesLoader resourcesLoader0 = k.a(context0, map0);
        if(resourcesLoader0 != null) {
            context0.getResources().addLoaders(new ResourcesLoader[]{resourcesLoader0});
            return true;
        }
        return false;
    }

    static boolean b(int v) {
        return 28 <= v && v <= 0x1F;
    }
}

