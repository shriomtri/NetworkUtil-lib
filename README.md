![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-Shriom%20Tripathi-green.svg?style=flat )

# NetworkUtil-lib

NetworkUilt is a fast and efficient open source network fetcher java class for Android which is use to make HTTP/HTTPS 
calls very easy. It accept URL as only parameter and return raw data in __String__.

**1.Use to make API calls.**

**2.Able to fetch JSON data efficiently.**

**3.Easy to use with web crawling.**

**4.Able to make network call on slow internet connection.**

**5.Conditions of \n and \r or " " is taken care of efficiently.**



## How to add this to your project?

STEP 1. Add the JitPack repository to your build file (Project Level)

```
  allprojects {
  
    repositories {
		  ...
		  maven { url 'https://jitpack.io' }
	  }
  }
```



STEP 2. Add the dependency (App Level)

	dependencies {
	        implementation 'com.github.jay006:NetworkUtil-lib:v0.2.0'
	}
  



__USAGE__:

Is can be using in saperate thread to make networking calls, i.e other than Main thread (UI thread).

Simple exmaple on usage:-
```
public class Fetch extends AsyncTask<Void, Void, Void>{
	@Override
	public String doInBackground(String args...){
		String URL = args[0];
		
		String resultData = NetworkUtil.makeServiceCall(URL);
		
		return resultData;
		
	}
}
```

Its not that hard as it looks. You need to call *new Fetch().execute(myUrl)* and in 'doInBackground'  __*NetworkUtil.makeServiceCall(myUrl)*__ will fetch you data.
