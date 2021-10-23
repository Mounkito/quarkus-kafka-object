package org.yohan;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

@ApplicationScoped
public class MovieConsumer {

    private final Logger logger = Logger.getLogger(MovieConsumer.class);

    @Incoming("movies-in")
    public void receive(Movie movie) {
        logger.infof("Got a movie: %s", movie);
    }

}
