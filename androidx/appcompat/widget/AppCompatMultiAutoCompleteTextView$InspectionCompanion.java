package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;

@RequiresApi(29)
@RestrictTo({Scope.a})
public final class AppCompatMultiAutoCompleteTextView.InspectionCompanion implements InspectionCompanion {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;

    public AppCompatMultiAutoCompleteTextView.InspectionCompanion() {
        this.a = false;
    }

    public void a(@NonNull AppCompatMultiAutoCompleteTextView appCompatMultiAutoCompleteTextView0, @NonNull PropertyReader propertyReader0) {
        if(!this.a) {
            throw e.a();
        }
        propertyReader0.readObject(this.b, appCompatMultiAutoCompleteTextView0.getBackgroundTintList());
        propertyReader0.readObject(this.c, appCompatMultiAutoCompleteTextView0.getBackgroundTintMode());
        propertyReader0.readObject(this.d, appCompatMultiAutoCompleteTextView0.getCompoundDrawableTintList());
        propertyReader0.readObject(this.e, appCompatMultiAutoCompleteTextView0.getCompoundDrawableTintMode());
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper0) {
        this.b = propertyMapper0.mapObject("backgroundTint", attr.backgroundTint);
        this.c = propertyMapper0.mapObject("backgroundTintMode", attr.backgroundTintMode);
        this.d = propertyMapper0.mapObject("drawableTint", attr.drawableTint);
        this.e = propertyMapper0.mapObject("drawableTintMode", attr.drawableTintMode);
        this.a = true;
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void readProperties(@NonNull Object object0, @NonNull PropertyReader propertyReader0) {
        this.a(((AppCompatMultiAutoCompleteTextView)object0), propertyReader0);
    }
}

