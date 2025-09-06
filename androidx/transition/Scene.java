package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Scene {
    private Context a;
    private int b;
    private ViewGroup c;
    private View d;
    private Runnable e;
    private Runnable f;

    public Scene(@NonNull ViewGroup viewGroup0) {
        this.b = -1;
        this.c = viewGroup0;
    }

    private Scene(ViewGroup viewGroup0, int v, Context context0) {
        this.a = context0;
        this.c = viewGroup0;
        this.b = v;
    }

    public Scene(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        this.b = -1;
        this.c = viewGroup0;
        this.d = view0;
    }

    public void a() {
        if(this.b > 0 || this.d != null) {
            this.e().removeAllViews();
            if(this.b > 0) {
                LayoutInflater.from(this.a).inflate(this.b, this.c);
            }
            else {
                this.c.addView(this.d);
            }
        }
        Runnable runnable0 = this.e;
        if(runnable0 != null) {
            runnable0.run();
        }
        Scene.g(this.c, this);
    }

    public void b() {
        if(Scene.c(this.c) == this) {
            Runnable runnable0 = this.f;
            if(runnable0 != null) {
                runnable0.run();
            }
        }
    }

    @Nullable
    public static Scene c(@NonNull ViewGroup viewGroup0) {
        return (Scene)viewGroup0.getTag(id.transition_current_scene);
    }

    @NonNull
    public static Scene d(@NonNull ViewGroup viewGroup0, @LayoutRes int v, @NonNull Context context0) {
        SparseArray sparseArray0 = (SparseArray)viewGroup0.getTag(id.transition_scene_layoutid_cache);
        if(sparseArray0 == null) {
            sparseArray0 = new SparseArray();
            viewGroup0.setTag(0x7F0B0FE8, sparseArray0);  // id:transition_scene_layoutid_cache
        }
        Scene scene0 = (Scene)sparseArray0.get(v);
        if(scene0 != null) {
            return scene0;
        }
        Scene scene1 = new Scene(viewGroup0, v, context0);
        sparseArray0.put(v, scene1);
        return scene1;
    }

    @NonNull
    public ViewGroup e() {
        return this.c;
    }

    boolean f() {
        return this.b > 0;
    }

    static void g(@NonNull ViewGroup viewGroup0, @Nullable Scene scene0) {
        viewGroup0.setTag(id.transition_current_scene, scene0);
    }

    public void h(@Nullable Runnable runnable0) {
        this.e = runnable0;
    }

    public void i(@Nullable Runnable runnable0) {
        this.f = runnable0;
    }
}

