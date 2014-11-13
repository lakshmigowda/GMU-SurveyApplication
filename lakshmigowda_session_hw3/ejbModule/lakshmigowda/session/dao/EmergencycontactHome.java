package lakshmigowda.session.dao;

// Generated Nov 11, 2014 5:17:49 AM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import lakshmigowda.session.entities.Emergencycontact;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Emergencycontact.
 * 
 * @see lakshmigowda.session.entities.Emergencycontact
 * @author Lakshmi
 */
@Stateless
public class EmergencycontactHome {

	private static final Log log = LogFactory
			.getLog(EmergencycontactHome.class);

	@PersistenceContext(unitName = "surveys")
	private EntityManager entityManager;

	public void persist(Emergencycontact transientInstance) {
		log.debug("persisting Emergencycontact instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Emergencycontact persistentInstance) {
		log.debug("removing Emergencycontact instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Emergencycontact merge(Emergencycontact detachedInstance) {
		log.debug("merging Emergencycontact instance");
		try {
			Emergencycontact result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Emergencycontact findById(String id) {
		log.debug("getting Emergencycontact instance with id: " + id);
		try {
			Emergencycontact instance = entityManager.find(
					Emergencycontact.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
