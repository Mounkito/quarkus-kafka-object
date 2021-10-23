package org.yohan;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class MovieResource {

    @Inject
    MovieProducer producer;

    @POST
    public Response send(Movie movie) {
        producer.sendMovieToKafka(movie);
        // Return an 202 - Accepted response.
        return Response.accepted().build();
    }
}