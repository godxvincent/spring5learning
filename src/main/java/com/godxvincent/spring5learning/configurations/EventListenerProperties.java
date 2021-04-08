package com.godxvincent.spring5learning.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

//El binding con esta anotación se inicializan a traves del constructor.
@ConstructorBinding
@ConfigurationProperties("sprint-events")
public class EventListenerProperties {

    private boolean springEventsEnabled;
    private boolean applicationContextInitializedListenerEnabled;
    private boolean applicationEnvironmentPreparedListenerEnabled;
    private boolean applicationFailedListenerEnabled;
    private boolean applicationPreparedListenerEnabled;
    private boolean applicationReadyListenerEnabled;
    private boolean applicationStartedListenerEnabled;
    private boolean applicationStartingListenerEnabled;
    private boolean availabilityChangeListenerEnabled;
    private boolean contextRefreshedListenerEnabled;
    private boolean webServerInitializedListenerEnabled;

    public EventListenerProperties(boolean springEventsEnabled, boolean applicationContextInitializedListenerEnabled, boolean applicationEnvironmentPreparedListenerEnabled, boolean applicationFailedListenerEnabled, boolean applicationPreparedListenerEnabled, boolean applicationReadyListenerEnabled, boolean applicationStartedListenerEnabled, boolean applicationStartingListenerEnabled, boolean availabilityChangeListenerEnabled, boolean contextRefreshedListenerEnabled, boolean webServerInitializedListenerEnabled) {
        this.springEventsEnabled = springEventsEnabled;
        this.applicationContextInitializedListenerEnabled = applicationContextInitializedListenerEnabled;
        this.applicationEnvironmentPreparedListenerEnabled = applicationEnvironmentPreparedListenerEnabled;
        this.applicationFailedListenerEnabled = applicationFailedListenerEnabled;
        this.applicationPreparedListenerEnabled = applicationPreparedListenerEnabled;
        this.applicationReadyListenerEnabled = applicationReadyListenerEnabled;
        this.applicationStartedListenerEnabled = applicationStartedListenerEnabled;
        this.applicationStartingListenerEnabled = applicationStartingListenerEnabled;
        this.availabilityChangeListenerEnabled = availabilityChangeListenerEnabled;
        this.contextRefreshedListenerEnabled = contextRefreshedListenerEnabled;
        this.webServerInitializedListenerEnabled = webServerInitializedListenerEnabled;
    }

    public boolean isSpringEventsEnabled() {
        return springEventsEnabled;
    }

    public boolean isApplicationContextInitializedListenerEnabled() {
        return applicationContextInitializedListenerEnabled;
    }

    public boolean isApplicationEnvironmentPreparedListenerEnabled() {
        return applicationEnvironmentPreparedListenerEnabled;
    }

    public boolean isApplicationFailedListenerEnabled() {
        return applicationFailedListenerEnabled;
    }

    public boolean isApplicationPreparedListenerEnabled() {
        return applicationPreparedListenerEnabled;
    }

    public boolean isApplicationReadyListenerEnabled() {
        return applicationReadyListenerEnabled;
    }

    public boolean isApplicationStartedListenerEnabled() {
        return applicationStartedListenerEnabled;
    }

    public boolean isApplicationStartingListenerEnabled() {
        return applicationStartingListenerEnabled;
    }

    public boolean isAvailabilityChangeListenerEnabled() {
        return availabilityChangeListenerEnabled;
    }

    public boolean isContextRefreshedListenerEnabled() {
        return contextRefreshedListenerEnabled;
    }

    public boolean isWebServerInitializedListenerEnabled() {
        return webServerInitializedListenerEnabled;
    }
}
