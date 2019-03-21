package cl.carteaga.querygithub.classes

import cl.carteaga.querygithub.classes.responseJson.ResponsePullRequest
import cl.carteaga.querygithub.classes.responseJson.ResponseRepository
import retrofit2.Call
import retrofit2.http.*


interface GitHubEndPoints {
    @GET("search/repositories")
    fun getRepositories(
        @Query("q") q: String,
        @Query("sort") sort: String,
        @Query("page") page: Int
    ) : Call<ResponseRepository>

    @GET("repos/{user}/{repository}/pulls")
    fun getPullRequestRepository(
        @Path("user") user: String,
        @Path("repository") repository: String
    ) : Call<List<ResponsePullRequest>>
}