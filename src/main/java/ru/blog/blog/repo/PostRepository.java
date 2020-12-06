package ru.blog.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.blog.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {}
