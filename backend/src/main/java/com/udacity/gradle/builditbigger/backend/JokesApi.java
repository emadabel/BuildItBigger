package com.udacity.gradle.builditbigger.backend;

import com.emadabel.jokesprovider.JokeSource;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "jokesApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class JokesApi {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "getFunnyJoke")
    public Joke getFunnyJoke() {
        Joke response = new Joke();
        response.setJoke(new JokeSource().getRandomJoke());
        return response;
    }

}
