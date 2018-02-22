package impl;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import transfer.TransferApplication;
import transfer.impl.HelloClientService;

@SpringBootTest(classes = TransferApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestService {

    @Autowired
    private HelloClientService helloClientService;

    @Test
    public void test() {

        helloClientService.helloClient();

    }

}

