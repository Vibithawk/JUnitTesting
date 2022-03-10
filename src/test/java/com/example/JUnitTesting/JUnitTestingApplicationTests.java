package com.example.JUnitTesting;
import com.example.JUnitTesting.Model.Junitmodel;
import com.example.JUnitTesting.Repository.Junitrepository;
import com.example.JUnitTesting.Service.Junitservice;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest
class JUnitTestingApplicationTests {
    @InjectMocks
    private Junitservice jservice;

    @Mock
    private Junitrepository repo;

    @Test
    public void getallBooksTest() {
       // assertEquals()
    }

    @Test
    public void getBookByauthorTest() {

        List <Junitmodel> junitmodelList = new ArrayList<>();
        when(jservice.getBookByauthor("james")).thenReturn(new ArrayList<>());
       assertEquals(junitmodelList,jservice.getBookByauthor("james"));

    }

    @Test
    public void getBookTest(){
        List<Junitmodel> jUnitModelGetList=new ArrayList<>();
        when(jservice.getbook()).thenReturn(new ArrayList<>());
        assertEquals(jUnitModelGetList,jservice.getbook());
    }
    @Test
    public void insertTest(){

        Junitmodel model=new Junitmodel("120","fjowofr","jfgfkj");
        when(jservice.addBooks(model)).thenReturn("Book Added successfully");
        //assertEquals(model,jservice.addBooks(model));

    }



    }



