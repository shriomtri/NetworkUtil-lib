# NetworkUtil-lib

NetworkUilt is a fast and efficient open source network fetcher java class for Android which is use to make HTTP/HTTPS 
calls very easy. It returns the raw data after making call by providing the correct URL.

1.Use to make API calls .

2.Able to fetch JSON data efficiently.

3.Easy to use with web crawling.

4.Able to make network call on slow internet connection.

5.Conditions of \n and \r or " " is taken care of efficiently.


### How to add this to your project? ###

STEP 1. Add the JitPack repository to your build file (Project Level)


  allprojects {
  
    repositories {
		  ...
		  maven { url 'https://jitpack.io' }
	  }
    
  }



STEP 2. Add the dependency (App Level)

	dependencies {
	        compile 'com.github.jay006:NetworkUtil-lib:v0.2.0'
	}
  



USAGE: 
  When ever you make the call to NetworkUtil class try to make it off the main theread.
  
  
      String resultData = NetworkUtil.makeServiceCall(myUrl);
  
  
 pass your url as (myUrl) in string format and fetched data will be in staring format (resultData).
