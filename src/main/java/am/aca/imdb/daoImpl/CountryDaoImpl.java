package am.aca.imdb.daoImpl;

import am.aca.imdb.dao.CountryDao;
import am.aca.imdb.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public abstract class CountryDaoImpl implements CountryDao {
    private EntityManager entityManager;
    @Autowired
    public CountryDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
