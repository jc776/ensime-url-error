## ENSIME URISyntaxException

ENSIME has an `URISyntaxException` on a JAR that has the file ````type`.class```, which prevents indexing from finishing.
- `sbt ensimeServerIndex` doesn't detect when it's done, turning 'Suspended' after a few minutes.
- `ensime-sublime` won't give completions (on e.g. `"Hello".`), but will output compiler errors.


ENSIME version: 2.0.0-M4
I'm on Windows 10.
`.ensime`, `build.sbt`, `plugins.sbt`, `build.properties` included.

```
$ sbt
> ensimeServerIndex
[info] Running org.ensime.server.Server
[info] ...
[info] 18:05:11.581 WARN  akka://ENSIME/user/ensime-main/project o.e.c.Project - Refresh failed: java.lang.IllegalArgumentException: Illegal character in opaque part at index 180: jar:file:///C:/Users/Jack/.coursier/cache/v1/https/repo1.maven.org/maven2/me/shadaj/slinky-web_sjs0.6_2.12/0.1.1/slinky-web_sjs0.6_2.12-0.1.1-sources.j
[info] 18:05:11.597 ERROR akka.dispatch.Dispatcher a.d.Dispatcher - Illegal character in opaque part at index 180: jar:file:///C:/Users/Jack/.coursier/cache/v1/https/repo1.maven.org/maven2/me/shadaj/slinky-web_sjs0.6_2.12/0.1.1/slinky-web_sjs0.6_2.12-0.1.1-sources.jar!/me/shadaj/slinky/web/svg/`type`.scala
[info] java.lang.IllegalArgumentException: Illegal character in opaque part at index 180: jar:file:///C:/Users/Jack/.coursier/cache/v1/https/repo1.maven.org/maven2/me/shadaj/slinky-web_sjs0.6_2.12/0.1.1/slinky-web_sjs0.6_2.12-0.1.1-sources.jar!/me/shadaj/slinky/web/svg/`type`.scala
[info] ...
[info] Caused by: java.net.URISyntaxException: Illegal character in opaque part at index 180: jar:file:///C:/Users/Jack/.coursier/cache/v1/https/repo1.maven.org/maven2/me/shadaj/slinky-web_sjs0.6_2.12/0.1.1/slinky-web_sjs0.6_2.12-0.1.1-sources.jar!/me/shadaj/slinky/web/svg/`type`.scala
```