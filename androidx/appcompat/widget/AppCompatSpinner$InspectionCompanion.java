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
public final class AppCompatSpinner.InspectionCompanion implements InspectionCompanion {
    private boolean a;
    private int b;
    private int c;

    public AppCompatSpinner.InspectionCompanion() {
        this.a = false;
    }

    public void a(@NonNull AppCompatSpinner appCompatSpinner0, @NonNull PropertyReader propertyReader0) {
        if(!this.a) {
            throw e.a();
        }
        propertyReader0.readObject(this.b, appCompatSpinner0.getBackgroundTintList());
        propertyReader0.readObject(this.c, appCompatSpinner0.getBackgroundTintMode());
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper0) {
        this.b = propertyMapper0.mapObject("backgroundTint", attr.backgroundTint);
        this.c = propertyMapper0.mapObject("backgroundTintMode", attr.backgroundTintMode);
        this.a = true;
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void readProperties(@NonNull Object object0, @NonNull PropertyReader propertyReader0) {
        this.a(((AppCompatSpinner)object0), propertyReader0);
    }
}

