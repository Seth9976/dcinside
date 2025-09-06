package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class InitializationCompletedEventRequestKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0) {
                L.p(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0, "builder");
                return new Dsl(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0) {
            this._builder = initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0;
        }

        public Dsl(Builder initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0, w w0) {
            this(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0);
        }

        @b0
        public final InitializationCompletedEventRequest _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (InitializationCompletedEventRequest)generatedMessageLite0;
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        @l
        @i(name = "getDynamicDeviceInfo")
        public final DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 = this._builder.getDynamicDeviceInfo();
            L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfoOuterClass$DynamicDeviceInfo0;
        }

        @l
        @i(name = "getStaticDeviceInfo")
        public final StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0 = this._builder.getStaticDeviceInfo();
            L.o(staticDeviceInfoOuterClass$StaticDeviceInfo0, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfoOuterClass$StaticDeviceInfo0;
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        @i(name = "setDynamicDeviceInfo")
        public final void setDynamicDeviceInfo(@l DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0, "value");
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
        }

        @i(name = "setStaticDeviceInfo")
        public final void setStaticDeviceInfo(@l StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            L.p(staticDeviceInfoOuterClass$StaticDeviceInfo0, "value");
            this._builder.setStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
        }
    }

    @l
    public static final InitializationCompletedEventRequestKt INSTANCE;

    static {
        InitializationCompletedEventRequestKt.INSTANCE = new InitializationCompletedEventRequestKt();
    }
}

