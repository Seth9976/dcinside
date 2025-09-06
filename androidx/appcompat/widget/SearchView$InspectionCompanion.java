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
public final class SearchView.InspectionCompanion implements InspectionCompanion {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;

    public SearchView.InspectionCompanion() {
        this.a = false;
    }

    public void a(@NonNull SearchView searchView0, @NonNull PropertyReader propertyReader0) {
        if(!this.a) {
            throw e.a();
        }
        propertyReader0.readInt(this.b, searchView0.getImeOptions());
        propertyReader0.readInt(this.c, searchView0.getMaxWidth());
        propertyReader0.readBoolean(this.d, searchView0.P());
        propertyReader0.readObject(this.e, searchView0.getQueryHint());
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper0) {
        this.b = propertyMapper0.mapInt("imeOptions", 0x1010264);
        this.c = propertyMapper0.mapInt("maxWidth", 0x101011F);
        this.d = propertyMapper0.mapBoolean("iconifiedByDefault", attr.iconifiedByDefault);
        this.e = propertyMapper0.mapObject("queryHint", attr.queryHint);
        this.a = true;
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void readProperties(@NonNull Object object0, @NonNull PropertyReader propertyReader0) {
        this.a(((SearchView)object0), propertyReader0);
    }
}

