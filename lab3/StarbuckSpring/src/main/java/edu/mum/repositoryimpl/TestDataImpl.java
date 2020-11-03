package edu.mum.repositoryimpl;

import edu.mum.repository.DataFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestDataImpl implements DataFacade {
    private static final Database data = new Database();

    @Override
    public String findPassword(String name) {
        return null;
    }

    @Override
    public List<String> getAdvice(String roast) {
        return data.getAdvice(roast);
    }
}
