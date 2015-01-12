package fr.uds.backlog.data;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.uds.backlog.model.BackLogEntity;

@ApplicationScoped
public class BackLogRepository {

	@Inject
    private EntityManager em;
	
	public List<BackLogEntity> getAllBackLogEntity(){
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<BackLogEntity> criteria = cb.createQuery(BackLogEntity.class);
        Root<BackLogEntity> backLogEntity = criteria.from(BackLogEntity.class);
        criteria.select(backLogEntity).orderBy(cb.asc(backLogEntity.get("name")));
		return em.createQuery(criteria).getResultList();
	}
}
