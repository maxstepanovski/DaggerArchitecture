package maksimstepanov.com.network.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import maksimstepanov.com.network.NetworkManager;

/**
 * Dagger Module for Network library
 */
@Module
public class NetworkModule {

    @Singleton
    @Provides
    NetworkManager provideNetworkManager() {
        return new NetworkManager();
    }
}
