package maksimstepanov.com.auth.di;

import dagger.Module;
import dagger.Provides;
import maksimstepanov.com.auth.AuthActivityPresenter;
import maksimstepanov.com.core.di.Screen;

@Module
public class AuthScreenModule {

    @Screen
    @Provides
    AuthActivityPresenter provideAuthPresenter() {
        return new AuthActivityPresenter();
    }
}
