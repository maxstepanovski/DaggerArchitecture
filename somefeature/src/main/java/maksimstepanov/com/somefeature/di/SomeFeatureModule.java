package maksimstepanov.com.somefeature.di;

import dagger.Module;
import dagger.Provides;
import maksimstepanov.com.core.di.Screen;
import maksimstepanov.com.network.NetworkManager;
import maksimstepanov.com.somefeature.SomeFeatureInteractor;

/**
 * SomeFeature dagger module
 */
@Module
public class SomeFeatureModule {

    @Screen
    @Provides
    SomeFeatureInteractor provideSomeFeatureInteractor(NetworkManager networkManager) {
        return new SomeFeatureInteractor(networkManager);
    }
}
