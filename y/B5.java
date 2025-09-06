package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class b5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final FrameLayout c;

    private b5(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull FrameLayout frameLayout0) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = frameLayout0;
    }

    @NonNull
    public static b5 a(@NonNull View view0) {
        int v = 0x7F0B067D;  // id:item_ai_lora_prompt_name
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B067D);  // id:item_ai_lora_prompt_name
        if(textView0 != null) {
            v = 0x7F0B067E;  // id:item_ai_lora_prompt_remove
            FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B067E);  // id:item_ai_lora_prompt_remove
            if(frameLayout0 != null) {
                return new b5(((ConstraintLayout)view0), textView0, frameLayout0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static b5 c(@NonNull LayoutInflater layoutInflater0) {
        return b5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static b5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01F1, viewGroup0, false);  // layout:view_item_ai_image_lora_prompt
        if(z) {
            viewGroup0.addView(view0);
        }
        return b5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

