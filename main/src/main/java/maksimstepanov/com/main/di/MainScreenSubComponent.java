package maksimstepanov.com.main.di;

import dagger.Subcomponent;
import maksimstepanov.com.core.di.Screen;
import maksimstepanov.com.core.di.ScreenSubComponent;
import maksimstepanov.com.main.presentation.view.MainActivity;

@Screen
@Subcomponent(modules = {MainScreenModule.class})
public interface MainScreenSubComponent extends ScreenSubComponent {
    void inject(MainActivity activity);
}
