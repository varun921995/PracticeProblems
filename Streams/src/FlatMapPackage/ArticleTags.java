package FlatMapPackage;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Article {
    String title;
    List<String> tags;

    Article(String title, List<String> tags) {
        this.title = title;
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", tags=" + tags +
                '}';
    }
}

public class ArticleTags {
    public static void main(String[] args) {
        List<Article> articles = Arrays.asList(
                new Article("Java Streams", Arrays.asList("java", "streams", "functional")),
                new Article("Spring Boot", Arrays.asList("spring", "java", "backend"))
        );
        List<String> tags = articles.stream().flatMap(article -> article.tags.stream()).distinct().toList();
//        System.out.println(tags);

        articles.forEach(article -> {
            article.tags = article.tags.stream().map(String::toUpperCase).toList();

        });
        System.out.println(articles.toString());

    }
}
