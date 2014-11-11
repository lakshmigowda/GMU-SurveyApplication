package lakshmigowda.session.entities;

// Generated Nov 11, 2014 1:30:50 AM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Survey.
 * 
 * @see lakshmigowda.session.entities.Survey
 * @author Hibernate Tools
 */
@Stateless
public class SurveyHome {

	private static final Log log = LogFactory.getLog(SurveyHome.class);

	@PersistenceContext(unitName = "surveys")
	private EntityManager entityManager;

	public void persist(Survey transientInstance) {
		log.debug("persisting Survey instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Survey persistentInstance) {
		log.debug("removing Survey instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Survey merge(Survey detachedInstance) {
		log.debug("merging Survey instance");
		try {
			Survey result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Survey findById(String id) {
		log.debug("getting Survey instance with id: " + id);
		try {
			Survey instance = entityManager.find(Survey.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
