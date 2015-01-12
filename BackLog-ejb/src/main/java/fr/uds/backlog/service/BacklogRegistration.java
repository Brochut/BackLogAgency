package fr.uds.backlog.service;

import fr.uds.backlog.model.BackLogEntity;
import fr.uds.backlog.model.Member;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import java.util.logging.Logger;

// The @Stateless annotation eliminates the need for manual transaction demarcation
@Stateless
public class BacklogRegistration {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private Event<BackLogEntity> BacklogEventSrc;

    public void register(BackLogEntity backlog) throws Exception {
        log.info("Registering " + backlog.getName());
        em.persist(backlog);
        BacklogEventSrc.fire(backlog);
    }
}
