package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.L;
import okhttp3.Route;
import y4.l;

public final class RouteDatabase {
    @l
    private final Set failedRoutes;

    public RouteDatabase() {
        this.failedRoutes = new LinkedHashSet();
    }

    public final void connected(@l Route route0) {
        synchronized(this) {
            L.p(route0, "route");
            this.failedRoutes.remove(route0);
        }
    }

    public final void failed(@l Route route0) {
        synchronized(this) {
            L.p(route0, "failedRoute");
            this.failedRoutes.add(route0);
        }
    }

    public final boolean shouldPostpone(@l Route route0) {
        synchronized(this) {
            L.p(route0, "route");
            return this.failedRoutes.contains(route0);
        }
    }
}

