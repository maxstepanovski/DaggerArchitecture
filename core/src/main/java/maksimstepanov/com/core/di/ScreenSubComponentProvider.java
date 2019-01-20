package maksimstepanov.com.core.di;

/**
 * Dagger Application interface. Provides all the screen subcomponents
 */
public interface ScreenSubComponentProvider {
    ScreenSubComponent getAuthScreenSubComponent();
    ScreenSubComponent getMainScreenSubComponent();
}
