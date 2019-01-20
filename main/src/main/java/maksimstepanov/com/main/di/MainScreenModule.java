package maksimstepanov.com.main.di;

import dagger.Module;
import dagger.Provides;
import maksimstepanov.com.core.di.Screen;
import maksimstepanov.com.main.presentation.presenter.MainPresenter;
import maksimstepanov.com.somefeature.SomeFeatureInteractor;

@Module
public class MainScreenModule {

    @Screen
    @Provides
    MainPresenter provideMainPresenter(SomeFeatureInteractor interactor) {
        return new MainPresenter(interactor);
    }
}
