## Constant Pool

String str1 = "hello"; </br>
String str2 = "hello"; </br>
일때 str1과 str2의 주소값도 일치한다?!

```java
String str1 = "hello";
String str2 = "hello";

System.out.println("str3.equals(str4) : "+str1.equals(str4));     // true
System.out.println("str3 == str4 : "+ (str3== str4));             // true
```

https://ecsimsw.tistory.com/entry/%EC%9E%90%EB%B0%94-equals%EC%99%80-%EB%B9%84%EA%B5%90-%EC%97%B0%EC%82%B0%EC%9E%90%EC%9D%98-%EC%B0%A8%EC%9D%B4-String-Pool
