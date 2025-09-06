package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager.StorageType;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.UUID;

public class GameSessionIdReader implements IGameSessionIdReader {
    private static final int GAME_SESSION_ID_LENGTH = 12;
    private static volatile GameSessionIdReader _instance;
    private Long gameSessionId;

    // 去混淆评级： 低(36)
    private void generate() {
        UUID.randomUUID();
        this.gameSessionId = 277130083198L;
    }

    @Override  // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public Long getGameSessionId() {
        synchronized(this) {
            if(this.gameSessionId == null) {
                this.generate();
            }
            return this.gameSessionId;
        }
    }

    @Override  // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public Long getGameSessionIdAndStore() {
        synchronized(this) {
            if(this.gameSessionId == null) {
                this.generate();
                this.store();
            }
            return this.gameSessionId;
        }
    }

    public static GameSessionIdReader getInstance() {
        if(GameSessionIdReader._instance == null) {
            Class class0 = GameSessionIdReader.class;
            synchronized(class0) {
                if(GameSessionIdReader._instance == null) {
                    GameSessionIdReader._instance = new GameSessionIdReader();
                }
            }
        }
        return GameSessionIdReader._instance;
    }

    private void store() {
        if(StorageManager.init(ClientProperties.getApplicationContext())) {
            Storage storage0 = StorageManager.getStorage(StorageType.PRIVATE);
            if(storage0 != null) {
                storage0.set("unifiedconfig.data.gameSessionId", this.gameSessionId);
                storage0.writeStorage();
            }
        }
    }
}

