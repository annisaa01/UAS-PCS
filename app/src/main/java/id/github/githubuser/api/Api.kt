package id.github.githubuser.api

import id.github.githubuser.data.model.DetailUserResponse
import id.github.githubuser.data.model.User
import id.github.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 7d107a1cd154e42ada50fa9d5609f99a763e6831")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 7d107a1cd154e42ada50fa9d5609f99a763e6831")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 7d107a1cd154e42ada50fa9d5609f99a763e6831")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 7d107a1cd154e42ada50fa9d5609f99a763e6831")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}