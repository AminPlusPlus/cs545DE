package edu.mum.serviceimpl;

import edu.mum.repository.DataFacade;
import edu.mum.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdviceServiceImpl implements AdviceService {

    @Autowired
    private DataFacade repository;

    @Override
    public List<String> getAdvice(String roast) {
        return repository.getAdvice(roast);
    }
}
