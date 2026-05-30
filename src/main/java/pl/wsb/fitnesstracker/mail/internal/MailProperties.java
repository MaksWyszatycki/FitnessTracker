package pl.wsb.fitnesstracker.mail.internal;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application.mail")
class MailProperties {

    private final String from;

    // RĘCZNY KONSTRUKTOR - Maven natychmiast przepuści kompilację
    public MailProperties(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }
}