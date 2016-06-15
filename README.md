# Curl-Logger-interceptor

A library that logs your request in cURL, used with [Retrofit](https://github.com/square/retrofit/tree/parent-2.0.2) HTTP client.

# How it works

Add the library in your `build.gradle` app level file 
```java
dependencies {
    ...
    compile 'com.github.grapesnberries:curlloggerinterceptor:0.1'
    
}
```

To start logging your requests, add a cURL interceptor to your `OkHttpClient`

```java
OkHttpClient.Builder client = new OkHttpClient.Builder()
                // add our curl logger here
                .addInterceptor(new CurlLoggerInterceptor());
                
        Retrofit retrofit = new Retrofit.Builder()
                ...
                .client(client.build())
                .build();

```

Yes you are done! Once you make any request you will find the output _Curl_ command in you logcat like that

<img src="https://s32.postimg.org/9cd27e8dh/Screen_Shot_2016_06_15_at_3_33_1_07_PM.png"/>

# Customized Log Tag

You can customize you logcat like that
```java
private final String TAG = "USER_TAG"

...

OkHttpClient.Builder client = new OkHttpClient.Builder()
                // add our curl logger here
                .addInterceptor(new CurlLoggerInterceptor(TAG));



```

# License

```
Copyright 2016 Grapes 'n' Berries

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
