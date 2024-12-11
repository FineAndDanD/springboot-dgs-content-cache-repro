package com.exemplars.contentcache.datafetchers;

import com.exemplars.contentcache.models.Show;
import com.exemplars.contentcache.utils.ContextInterceptor;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsExecutionResult;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.context.DgsContext;
import graphql.GraphQLContext;

import java.util.List;

@DgsComponent
public class ShowsDataFetcher {

    private final List<Show> shows = List.of(
            new Show("1", "The Stupids", "Stanley Stupid has no idea what's goin on!!!")
    );

    @DgsQuery
    public List<Show> shows(DgsDataFetchingEnvironment dfe, DgsExecutionResult executionResult) {
        return shows;
    }
}
