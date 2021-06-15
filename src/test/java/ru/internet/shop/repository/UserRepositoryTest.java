package ru.internet.shop.repository;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import ru.internet.shop.data.UserData;
import ru.internet.shop.model.User;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Transactional
    @Test
    public void save() {
        User actual = UserData.user100002;
        User expected = repository.save(actual);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void get() {
        User actual = UserData.user100002;
        User expected = repository.save(actual);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Transactional
    @Test(expected = JpaObjectRetrievalFailureException.class)
    public void delete() {
        repository.deleteById(100001);
        repository.getById(100001);
        Assert.assertEquals(1, repository.findAll().size());
    }

    @Test
    public void getAll() {
        List<User> actualList = UserData.USER_LIST;
        List<User> expectedList = repository.findAll();
        Assertions.assertThat(actualList).isEqualTo(expectedList);
    }
}
