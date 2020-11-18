```java

自建Sentry

Sentry除了官方版以外，也可以自建自托管版本的Sentry。官方版存在用量限制，可能需要付费；自托管版没有用量限制，但是官方不提供技术支持。自建Sentry也非常简单，需要Docker和Docker Compose，硬件上需要至少2.4G空闲内存。

git clone https://github.com/getsentry/onpremise.git
cd onpremise
./install.sh

之后就可以在localhost:9000上看到自建的Sentry了，可以配合Nginx反向代理调整端口到80/443使用。


```

```properties
https://sentry.io/organizations/youxiu326/issues/2037992528/?project=5520985&query=is%3Aunresolved#threads
```

```properties
参考：
https://springboot.io/t/topic/2960
```