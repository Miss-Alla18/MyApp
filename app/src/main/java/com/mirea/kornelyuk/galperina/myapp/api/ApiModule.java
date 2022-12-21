package com.mirea.kornelyuk.galperina.myapp.api;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class ApiModule {

    @Provides
    public Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create())
                .baseUrl("http://192.168.1.5:8080")
                .build();
    }

    @Provides
    public IKosherServerService provideIKosherServerService(Retrofit retrofit) {
        return retrofit.create(IKosherServerService.class);
    }
}
