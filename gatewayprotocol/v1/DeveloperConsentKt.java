package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class DeveloperConsentKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder developerConsentOuterClass$DeveloperConsent$Builder0) {
                L.p(developerConsentOuterClass$DeveloperConsent$Builder0, "builder");
                return new Dsl(developerConsentOuterClass$DeveloperConsent$Builder0, null);
            }
        }

        public static final class OptionsProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder developerConsentOuterClass$DeveloperConsent$Builder0) {
            this._builder = developerConsentOuterClass$DeveloperConsent$Builder0;
        }

        public Dsl(Builder developerConsentOuterClass$DeveloperConsent$Builder0, w w0) {
            this(developerConsentOuterClass$DeveloperConsent$Builder0);
        }

        @b0
        public final DeveloperConsent _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (DeveloperConsent)generatedMessageLite0;
        }

        @i(name = "addAllOptions")
        public final void addAllOptions(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllOptions(iterable0);
        }

        @i(name = "addOptions")
        public final void addOptions(DslList dslList0, DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0) {
            L.p(dslList0, "<this>");
            L.p(developerConsentOuterClass$DeveloperConsentOption0, "value");
            this._builder.addOptions(developerConsentOuterClass$DeveloperConsentOption0);
        }

        @i(name = "clearOptions")
        public final void clearOptions(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearOptions();
        }

        public final DslList getOptions() {
            List list0 = this._builder.getOptionsList();
            L.o(list0, "_builder.getOptionsList()");
            return new DslList(list0);
        }

        @i(name = "plusAssignAllOptions")
        public final void plusAssignAllOptions(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllOptions(dslList0, iterable0);
        }

        @i(name = "plusAssignOptions")
        public final void plusAssignOptions(DslList dslList0, DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0) {
            L.p(dslList0, "<this>");
            L.p(developerConsentOuterClass$DeveloperConsentOption0, "value");
            this.addOptions(dslList0, developerConsentOuterClass$DeveloperConsentOption0);
        }

        @i(name = "setOptions")
        public final void setOptions(DslList dslList0, int v, DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0) {
            L.p(dslList0, "<this>");
            L.p(developerConsentOuterClass$DeveloperConsentOption0, "value");
            this._builder.setOptions(v, developerConsentOuterClass$DeveloperConsentOption0);
        }
    }

    @l
    public static final DeveloperConsentKt INSTANCE;

    static {
        DeveloperConsentKt.INSTANCE = new DeveloperConsentKt();
    }
}

