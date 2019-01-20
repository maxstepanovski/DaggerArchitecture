package maksimstepanov.com.auth.di;

import dagger.Subcomponent;
import maksimstepanov.com.auth.AuthActivity;
import maksimstepanov.com.core.di.Screen;
import maksimstepanov.com.core.di.ScreenSubComponent;

/**
 * Component with Screen Scope
 * Injects inside AuthActivity
 */
@Screen
@Subcomponent(modules = {AuthScreenModule.class})
public interface AuthScreenSubComponent extends ScreenSubComponent {
    void inject(AuthActivity activity);
}
