package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.manager.o.b;
import com.dcinside.app.glide.DcAppGlideModule;
import com.dcinside.app.glide.e;
import java.util.Collections;
import java.util.Set;

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final DcAppGlideModule a;

    public GeneratedAppGlideModuleImpl(Context context0) {
        this.a = new DcAppGlideModule();
        if(Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.dcinside.app.glide.DcAppGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.webp.WebpGlideLibraryModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.dcinside.app.glide.OkHttpGlideModule");
        }
    }

    @Override  // com.bumptech.glide.module.a
    public void a(@NonNull Context context0, @NonNull d d0) {
        this.a.a(context0, d0);
    }

    @Override  // com.bumptech.glide.module.d
    public void b(@NonNull Context context0, @NonNull c c0, @NonNull k k0) {
        new com.bumptech.glide.integration.webp.c().b(context0, c0, k0);
        new e().b(context0, c0, k0);
        this.a.b(context0, c0, k0);
    }

    @Override  // com.bumptech.glide.module.a
    public boolean c() {
        return this.a.c();
    }

    @Override  // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public Set d() {
        return Collections.emptySet();
    }

    @Override  // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    b e() {
        return this.f();
    }

    @NonNull
    a f() {
        return new a();
    }
}

