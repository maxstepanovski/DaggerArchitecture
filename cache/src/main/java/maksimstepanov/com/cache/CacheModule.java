package maksimstepanov.com.cache;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CacheModule {

    @Singleton
    @Provides
    CacheManager provideCacheManager() {
        return new CacheManager();
    }
}
