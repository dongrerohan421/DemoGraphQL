package com.example.DemoGraphQL.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.DemoGraphQL.model.Author;
import com.example.DemoGraphQL.model.Book;
import com.example.DemoGraphQL.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BookResolver implements GraphQLResolver<Book> {
    @Autowired
    private AuthorRepository authorRepository;

    public Optional<Author> getAuthor(Book book){
        return authorRepository.findById(book.getAuthor().getId());
    }
}