package com.example.JUnitTesting.Service;
import com.example.JUnitTesting.Model.Junitmodel;
import com.example.JUnitTesting.Repository.Junitrepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Junitservice {

    @Autowired
    Junitrepository repo;

    public List<Junitmodel> getbook() {
        return repo.findAll();
    }

    public List<Junitmodel> getBookByauthor(String author) {
        List<Junitmodel> model = repo.findByAuthor(author);
        return model;
    }

    public String addBooks(@NotNull Junitmodel books) {
        Junitmodel junitmodel = new Junitmodel(books.getId(), books.getName(), books.getAuthorname());
        repo.save(junitmodel);
        return "successfully created";
    }

}
