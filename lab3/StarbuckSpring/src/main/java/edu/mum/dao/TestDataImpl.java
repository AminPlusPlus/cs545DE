package edu.mum.dao;

import edu.mum.repository.DataFacade;
import edu.mum.repositoryimpl.Database;

import java.util.List;

// Implements Singleton Pattern
public class TestDataImpl implements DataFacade {

    private static final Database data = new Database();

    // Private constructor. Prevents instantiation from other classes.
    private TestDataImpl() {

    }

    // eager init'ed singleton...
    public final static TestDataImpl INSTANCE = new TestDataImpl();

    @Override
    public String findPassword(String name) {
          String expectedPassword = data.getPassword(name);
         return expectedPassword;
    }

    @Override
    public List<String> getAdvice(String roast) {
        return data.getAdvice(roast);
    }

//    @Override
//    public String findPassword (String name ) {
//        String expectedPassword = data.getPassword(name);
//        return expectedPassword;
//    }
//    @Override
//    public List<String> getAdvice(String roast) {
//
//    }
}



