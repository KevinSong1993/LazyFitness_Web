package dao.impl;

import dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>{

    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public void save(T entity) {
        getHibernateTemplate().save(entity);
    }

    @Override
    public void update(T entity) {
        getHibernateTemplate().update(entity);
    }

    @Override
    public void deleteById(Serializable id) {
        getHibernateTemplate().delete(findById(id));
    }

    @Override
    public T findById(Serializable id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
